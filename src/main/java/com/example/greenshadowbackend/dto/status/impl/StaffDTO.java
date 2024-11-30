package com.example.greenshadowbackend.dto.status.impl;

import com.example.greenshadowbackend.util.role.Designation;
import com.example.greenshadowbackend.util.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO {
    private String staffId;
    private String firstName;
    private String lastName;
    private Designation designation;
    private String gender;
    private String joinedDate;
    private Date dateOfBirth;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNumber;
    private String email;
    private Role role;

    private List<FieldStaffDTO> fieldStaffList;
    private List<StaffVehicleDTO> staffVehicles;
    private List<LogDTO> logs;
}
