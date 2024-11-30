package com.example.greenshadowbackend.dto.status.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldDTO {
    private String fieldCode;
    private String name;
    private Point location;
    private Long fieldImage1;
    private Long fieldImage2;

    private List<EquipmentDTO> equipment;
    private List<CropDTO> crops;
    private List<LogDTO> logs;
}
