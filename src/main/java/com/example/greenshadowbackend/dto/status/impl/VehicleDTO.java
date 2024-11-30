package com.example.greenshadowbackend.dto.status.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private String vehicleCode;
    private String vehicleCategory;
    private String fuelType;
    private String licensePlateNumber;
    private String status;
    private String remarks;

    private List<StaffVehicleDTO> staffVehicles;
}
