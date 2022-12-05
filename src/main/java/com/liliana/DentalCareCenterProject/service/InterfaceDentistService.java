package com.liliana.DentalCareCenterProject.service;
import com.liliana.DentalCareCenterProject.model.DentistDto;


import java.util.Set;

public interface InterfaceDentistService {
    void saveDentist(DentistDto dentistDto);
    void deleteDentistById(Integer dentistId);
    DentistDto getDentistById(Integer dentistId);
    void updateDentist(DentistDto dentistDto);
    Set<DentistDto> getAllDentists();
}
