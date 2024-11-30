package com.example.greenshadowbackend.customStatusCode;

import com.example.greenshadowbackend.dto.status.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedClassErrorStatus implements CropStatus, EquipmentStatus, FieldStaffStatus, FieldStatus, LogStatus, StaffStatus, VehicleStatus, UserStatus, StaffVehicleStatus {
    private int status;
    private String statusMessage;
}
