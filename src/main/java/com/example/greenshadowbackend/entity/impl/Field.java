package com.example.greenshadowbackend.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fields")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fieldCode;

    private String name;
    private Point location;
    private double sizeOfField;
    private String fieldImage1;
    private String fieldImage2;

    @ManyToMany
    @JoinTable(
            name = "Field_Equipment",
            joinColumns = @JoinColumn(name = "field_code"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id")
    )
    private List<Equipment> equipment;

    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL)
    private List<Crop> crops;

    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL)
    private List<Log> logs;
}
