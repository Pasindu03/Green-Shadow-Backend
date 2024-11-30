package com.example.greenshadowbackend.dto.status.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropDTO {
    private String cropCode;
    private String name;
    private String scientificName;
    private String cropImage;
    private String category;
    private String cropSeason;
    private String fieldCode;

    private FieldDTO field;
}
