package com.liliana.DentalCareCenterProject.service;

import com.liliana.DentalCareCenterProject.exception.ResourceNotFoundException;
import com.liliana.DentalCareCenterProject.model.DentistDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DentistServiceTest {

    @Autowired
    private InterfaceDentistService dentistService;

    @Test
    public void testSaveDentist() throws ResourceNotFoundException {
        //Given
        DentistDto dentistDto = new DentistDto();
        dentistDto.setLastName("Jaramillo");
        dentistDto.setName("Ernesto");
        dentistDto.setDentistId(123);
        dentistService.saveDentist(dentistDto);

        //When
        DentistDto testDentistDto = dentistService.getDentistById(123);

        //Then
        assertFalse(testDentistDto!=null);

    }

}