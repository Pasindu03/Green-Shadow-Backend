package com.example.greenshadowbackend.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleCode;

    private String vehicleCategory;
    private String fuelType;
    private String licensePlate;
    private String remarks;
    private String status;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<StaffVehicle> staffVehicles;
}
