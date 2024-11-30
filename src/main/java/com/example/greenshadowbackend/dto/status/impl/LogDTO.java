package com.example.greenshadowbackend.dto.status.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogDTO {
    private String logCode;
    private Date logDate;
    private String observation;

    private StaffDTO staff;
    private FieldDTO field;
}
