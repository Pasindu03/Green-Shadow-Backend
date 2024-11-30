package com.example.greenshadowbackend.entity.impl;

import com.example.greenshadowbackend.util.role.Designation;
import com.example.greenshadowbackend.util.role.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffId;

    private String firstName;
    private String lastName;
    private Designation designation;
    private String gender;
    private Date joinedDate;
    private Date dateOfBirth;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNumber;
    private String email;
    private Role role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
    private List<FieldStaff> fieldStaffList;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
    private List<StaffVehicle> staffVehicles;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
    private List<Log> logs;
}
