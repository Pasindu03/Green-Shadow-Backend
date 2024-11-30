package com.example.greenshadowbackend.entity.impl;

import com.example.greenshadowbackend.util.role.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equipments")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String equipmentId;

    private String name;
    private String type;
    private Status status;

    @ManyToMany(mappedBy = "equipment")
    private List<Field> fields;
}
