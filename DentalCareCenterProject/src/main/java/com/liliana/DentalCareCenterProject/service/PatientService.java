package com.liliana.DentalCareCenterProject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liliana.DentalCareCenterProject.model.Patient;
import com.liliana.DentalCareCenterProject.model.PatientDto;
import com.liliana.DentalCareCenterProject.repository.PatientRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PatientService implements InterfacePatientService {

    //Dependency Injection
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    ObjectMapper mapper;


    //Methods
    @Override
    public void savePatient(PatientDto patientDto) {
        //Convert patientDto to patient
        Patient patient = mapper.convertValue(patientDto, Patient.class);
        patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Integer patientId) {
        patientRepository.deleteById(patientId);

    }

    @Override
    public PatientDto getPatientById(Integer patientId) {
        Optional<Patient> patient = patientRepository.findById(patientId);
        //Create container
        PatientDto patientDto = null;
        //If it exists, convert to patientDto
        if(patient.isPresent()){
            patientDto = mapper.convertValue(patient, PatientDto.class);
        }
        return patientDto;
    }

    @Override
    public void updatePatient(PatientDto patientDto) {
        //Reuse the save method.
        savePatient(patientDto);
    }

    @Override
    public Set<PatientDto> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        //Create container to save a list of patientDto
        Set<PatientDto> patientDtos = new HashSet<>();
        //Convert patient into PatientDto to return the right list
        for(Patient patient: patients){
            patientDtos.add(mapper.convertValue(patient, PatientDto.class));
        }
        return patientDtos;
    }
}
