package com.sarahhanley.iFoster.models;

public enum SpeciesType {
    FELINE ("Feline"),
    CANINE ("Canine"),
    OTHER ("Other");

    private final String name;

    SpeciesType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
