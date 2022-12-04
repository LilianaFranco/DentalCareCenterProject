package com.liliana.DentalCareCenterProject.model;

import java.util.Date;

public class PatientDto {
    //Properties
    private int idCard;
    private String lastName;
    private String name;
    private String address;
    private Date registrationDate;

    //Empty Constructor
    public PatientDto() {
    }

    //Constructor
    public PatientDto(int idCard, String lastName, String name, String address, Date registrationDate) {
        this.idCard = idCard;
        this.lastName = lastName;
        this.name = name;
        this.address = address;
        this.registrationDate = registrationDate;
    }

    //Getters and Setters
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    //Methods
    @Override
    public String toString() {
        return "Patient{" +
                ", idCard=" + idCard +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
