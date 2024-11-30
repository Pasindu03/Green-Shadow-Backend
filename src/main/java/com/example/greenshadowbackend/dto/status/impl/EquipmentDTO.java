package com.example.greenshadowbackend.dto.status.impl;

import com.example.greenshadowbackend.util.role.EquipmentType;
import com.example.greenshadowbackend.util.role.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDTO {
    private String equipmentId;
    private String name;
    private EquipmentType type;
    private Status status;

    private List<FieldDTO> fields;
}
