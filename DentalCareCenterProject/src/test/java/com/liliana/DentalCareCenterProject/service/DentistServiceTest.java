package com.liliana.DentalCareCenterProject.service;

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
    public void testSaveDentist(){
        //Given
        DentistDto dentistDto = new DentistDto(123, 456, "Jaramillo", "Camilo");
        dentistService.saveDentist(dentistDto);

        //When
        DentistDto testDentistDto = dentistService.getDentistById(123);

        //Then
        assertTrue(testDentistDto!=null);

    }

}