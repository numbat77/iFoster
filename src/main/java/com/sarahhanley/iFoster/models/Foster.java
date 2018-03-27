package com.sarahhanley.iFoster.models;

import java.util.ArrayList;

public class Foster extends Human {
    private FosterType fosterType;
    private int availableFosterSpace;
    private boolean available;
    private ArrayList<Animal> currentFosterAnimals;
    private  ArrayList<Animal> pastFosterAnimals;

    public Foster() {}

    public Foster(String firstName, String lastName, int phoneNumber, Address address, FosterType fosterType) {
        super(firstName, lastName, phoneNumber, address);
        this.fosterType = fosterType;
    }

    public FosterType getFosterType() {
        return fosterType;
    }

    public void setFosterType(FosterType fosterType) {
        this.fosterType = fosterType;
    }

    public int getAvailableFosterSpace() {
        return availableFosterSpace;
    }

    public void setAvailableFosterSpace(int availableFosterSpace) {
        this.availableFosterSpace = availableFosterSpace;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public ArrayList<Animal> getCurrentFosterAnimals() {
        return currentFosterAnimals;
    }

    public void setCurrentFosterAnimals(ArrayList<Animal> currentFosterAnimals) {
        this.currentFosterAnimals = currentFosterAnimals;
    }

    public ArrayList<Animal> getPastFosterAnimals() {
        return pastFosterAnimals;
    }

    public void setPastFosterAnimals(ArrayList<Animal> pastFosterAnimals) {
        this.pastFosterAnimals = pastFosterAnimals;
    }
}
