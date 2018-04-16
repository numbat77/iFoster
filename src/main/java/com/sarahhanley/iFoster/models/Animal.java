package com.sarahhanley.iFoster.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=50)
    private String name;
    private boolean adopted;

    @ManyToMany(mappedBy = "ownedAnimals")
    private List<Human> owners;

    @ManyToMany(mappedBy = "currentFosterAnimals")
    private List<Human> currentFoster;

    @ManyToMany(mappedBy = "pastFosterAnimals")
    private List<Human> pastFosters;

    private GenderTypes gender;
    private boolean altered;

    @ManyToMany(mappedBy = "animals")
    private List<Requirements> requirements;

    @Column(name = "birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String origin;
    private SpeciesType species;
    private String age;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int id) {this.id = id;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public GenderTypes getGender() {
        return gender;
    }

    public void setGender(GenderTypes gender) {
        this.gender = gender;
    }

    public boolean isAltered() {
        return altered;
    }

    public void setAltered(boolean altered) {
        this.altered = altered;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public SpeciesType getSpecies() {
        return species;
    }

    public void setSpecies(SpeciesType species) {
        this.species = species;
    }

    public String getAge() {
        age = AgeCalc.calculateAge(birthday);
        return age;
    }
}
