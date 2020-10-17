package com.franktran.spring.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerDto {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private Long customerId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String address;
    private String city;
    private String state;
    private Integer points;

    public CustomerDto() {
    }

    public LocalDate getSubmissionBirthDateConverted() {
        if (birthDate == null) {
            return null;
        }
        return LocalDate.parse(birthDate);
    }

    public void setSubmissionBirthDate(LocalDate localDate) {
        if (localDate == null) {
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        this.birthDate = formatter.format(localDate);
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
