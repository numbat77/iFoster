package com.sarahhanley.iFoster.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=50)
    private String animal_name;
    private boolean adopted;

    @ManyToMany(mappedBy = "ownedAnimals")
    private List<Human> owners;

    @ManyToMany(mappedBy = "currentFosterAnimals")
    private List<Human> currentFoster;

    @ManyToMany(mappedBy = "pastFosterAnimals")
    private List<Human> pastFosters;

    private Gender gender;
    private boolean altered;

    @ManyToMany(mappedBy = "animals")
    private List<Preference> prefrences;

    private Date birthdate;
    private String origin;
    private AnimalType animalType;

    public Animal() {}

    public Animal(String animal_name) {
        this.animal_name = animal_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return animal_name;
    }

    public void setName(String name) {
        this.animal_name = name;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isAltered() {
        return altered;
    }

    public void setAltered(boolean altered) {
        this.altered = altered;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
