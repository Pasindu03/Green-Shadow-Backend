package com.example.greenshadowbackend.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crops")
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cropCode;

    private String name;
    private String cropScientificName;
    private String cropImage;
    private String category;
    private String cropSeason;

    @ManyToOne
    @JoinColumn(name = "field_code")
    private Field field;
}
