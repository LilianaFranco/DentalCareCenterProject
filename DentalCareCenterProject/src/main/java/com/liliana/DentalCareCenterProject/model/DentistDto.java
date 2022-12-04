package com.liliana.DentalCareCenterProject.model;


public class DentistDto {

    //Properties
    private Integer dentistId;
    private String lastName;
    private String name;

    //Empty Constructor
    public DentistDto() {
    }

    //Constructor
    public DentistDto(Integer dentistId, String lastName, String name) {
        this.dentistId = dentistId;
        this.lastName = lastName;
        this.name = name;
    }

    //Getters and Setters
    public Integer getDentistId() {
        return dentistId;
    }

    public void setDentistId(Integer dentistId) {
        this.dentistId = dentistId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    @Override
    public String toString() {
        return "Dentist{" +
                ", dentalLicense=" + dentistId +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
