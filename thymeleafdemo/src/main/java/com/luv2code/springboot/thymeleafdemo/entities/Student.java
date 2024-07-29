package com.luv2code.springboot.thymeleafdemo.entities;

import com.luv2code.springboot.thymeleafdemo.annotations.StartsWith;
import jakarta.validation.constraints.NotNull;

public class Student {

    private String firstName;
    private String lastName;

    @StartsWith(message = "Musta starts with LUV", value = "LUV1")
    @NotNull(message = "is required.")
    private String email;

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", email= '" + email + '\'' +
                ", country= '" + country + '\'' +
                '}';
    }
}
