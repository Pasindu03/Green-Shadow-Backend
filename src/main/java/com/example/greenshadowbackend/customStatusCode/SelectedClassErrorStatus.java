package com.example.greenshadowbackend.customStatusCode;

import com.example.greenshadowbackend.dto.status.*;

public class SelectedClassErrorStatus implements CropStatus, EquipmentStatus, FieldStaffStatus, FieldStatus, LogStatus, StaffStatus, VehicleStatus, UserStatus, StaffVehicleStatus {
    private int status;
    private String statusMessage;
}
