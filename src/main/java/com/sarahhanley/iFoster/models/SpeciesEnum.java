package com.sarahhanley.iFoster.models;

public enum SpeciesEnum {
    FELINE ("Feline"),
    CANINE ("Canine"),
    OTHER ("Other");

    private final String name;

    SpeciesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
