package com.liliana.DentalCareCenterProject.service;

import com.liliana.DentalCareCenterProject.model.PatientDto;

import java.util.Set;

public interface InterfacePatientService {

    void savePatient(PatientDto patientDto);
    void deletePatientById(Integer patientId);
    PatientDto getPatientById(Integer patientId);
    void updatePatient(PatientDto patientDto);
    Set<PatientDto> getAllPatients();


}
