package com.example.greenshadowbackend.util.mapper;

import com.example.greenshadowbackend.dto.status.impl.*;
import com.example.greenshadowbackend.entity.impl.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper mapper;

    /*User*/

    public User toUserEntity(UserDTO userDTO) { return mapper.map(userDTO, User.class); }

    public UserDTO toUserDTO(User user) { return mapper.map(user, UserDTO.class); }

    public List<UserDTO> asUserDTOList(List<User> users) {return mapper.map(users, new TypeToken<List<UserDTO>>() {}.getType());}

    /*Crop*/

    public Crop toCropEntity(CropDTO cropDTO) { return mapper.map(cropDTO, Crop.class); }

    public CropDTO toCropDTO(Crop crop) { return mapper.map(crop, CropDTO.class); }

    public List<CropDTO> asCropDTOList(List<Crop> crops) { return mapper.map(crops, new TypeToken<List<CropDTO>>() {}.getType()); }

    /*Equipment*/

    public Equipment toEquipmentEntity(EquipmentDTO equipmentDTO) { return mapper.map(equipmentDTO, Equipment.class); }

    public EquipmentDTO toEquipmentDTO(Equipment equipment) { return mapper.map(equipment, EquipmentDTO.class); }

    public List<EquipmentDTO> asEquipmentDTOList(List<Equipment> equipments) { return mapper.map(equipments, new TypeToken<List<EquipmentDTO>>() {}.getType()); }

    /*Field*/

    public Field toFieldEntity(FieldDTO fieldDTO) { return mapper.map(fieldDTO, Field.class); }

    public FieldDTO toFieldDTO(Field field) { return mapper.map(field, FieldDTO.class); }

    public List<FieldDTO> asFieldDTOList(List<Field> fields) { return mapper.map(fields, new TypeToken<List<FieldDTO>>() {}.getType()); }

    /*Log*/

    public Log toLogEntity(LogDTO logDTO) { return mapper.map(logDTO, Log.class); }

    public LogDTO toLogDTO(Log log) { return mapper.map(log, LogDTO.class); }

    public List<LogDTO> asLogDTOList(List<Log> logs) { return mapper.map(logs, new TypeToken<List<LogDTO>>() {}.getType()); }

    /*Staff*/

    public Staff toStaffEntity(StaffDTO staffDTO) { return mapper.map(staffDTO, Staff.class); }

    public StaffDTO toStaffDTO(Staff staff) { return mapper.map(staff, StaffDTO.class); }

    public List<StaffDTO> asStaffDTOList(List<Staff> staffs) { return mapper.map(staffs, new TypeToken<List<StaffDTO>>() {}.getType()); }

    /*Vehicle*/

    public Vehicle toVehicleEntity(VehicleDTO vehicleDTO) { return mapper.map(vehicleDTO, Vehicle.class); }

    public VehicleDTO toVehicleDTO(Vehicle vehicle) { return mapper.map(vehicle, VehicleDTO.class); }

    public List<VehicleDTO> asVehicleDTOList(List<Vehicle> vehicles) { return mapper.map(vehicles, new TypeToken<List<VehicleDTO>>() {}.getType()); }
}
