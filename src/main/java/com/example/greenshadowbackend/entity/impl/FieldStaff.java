package com.example.greenshadowbackend.entity.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "field_staff")
public class FieldStaff {
    @Id
    private String id;

    @ManyToOne
    private Field field;

    @ManyToOne
    private Staff staff;
}
