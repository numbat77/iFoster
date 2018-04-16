package com.sarahhanley.iFoster.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Human {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=50)
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private GenderTypes gender;
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @ManyToOne
    private Address address;

    private boolean foster;
    private boolean adopter;

    @ManyToMany(mappedBy = "humans")
    private List<Requirements> prefrences;

    @ManyToMany
    private List<Animal> ownedAnimals;

    @ManyToMany
    private List<Animal> currentFosterAnimals;

    @ManyToMany
    private List<Animal> pastFosterAnimals;

    public Human() {}

    public Human(String firstName, String lastName, int phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
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

    public GenderTypes getGender() {
        return gender;
    }

    public void setGender(GenderTypes gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isFoster() {
        return foster;
    }

    public void setFoster(boolean foster) {
        this.foster = foster;
    }

    public boolean isAdopter() {
        return adopter;
    }

    public void setAdopter(boolean adopter) {
        this.adopter = adopter;
    }

    public List<Animal> getOwnedAnimals() {
        return ownedAnimals;
    }

    public void setOwnedAnimals(ArrayList<Animal> ownedAnimals) {
        this.ownedAnimals = ownedAnimals;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
