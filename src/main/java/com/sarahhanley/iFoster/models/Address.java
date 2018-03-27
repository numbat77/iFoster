package com.sarahhanley.iFoster.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {

    @OneToMany
    @JoinColumn(name = "address_id")
    private List<Human> humans;

    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        humans = new ArrayList<>();
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        humans = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String format() {
        return street + "\n" + city + ", " + state + " " + zip;
    }
}

