package com.example.greenshadowbackend.dto.status.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffVehicleDTO {
    private Long id;
    private StaffDTO staff;
    private VehicleDTO vehicle;
}
