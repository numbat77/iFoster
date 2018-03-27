package com.sarahhanley.iFoster.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Preference {

    @Id
    @GeneratedValue
    private int id;

    private boolean catFriendly;
    private boolean kidFriendly;
    private boolean dogFriendly;
    private String other;

    @ManyToMany
    private List<Animal> animals;

    @ManyToMany
    private List<Human> humans;

    public Preference() {}

    public Preference(boolean catFriendly, boolean kidFriendly, boolean dogFriendly) {
        this.catFriendly = catFriendly;
        this.kidFriendly = kidFriendly;
        this.dogFriendly = dogFriendly;
    }

    public int getId() {
        return id;
    }

    public boolean isCatFriendly() {
        return catFriendly;
    }

    public void setCatFriendly(boolean catFriendly) {
        this.catFriendly = catFriendly;
    }

    public boolean isKidFriendly() {
        return kidFriendly;
    }

    public void setKidFriendly(boolean kidFriendly) {
        this.kidFriendly = kidFriendly;
    }

    public boolean isDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(boolean dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}