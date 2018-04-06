package com.sarahhanley.iFoster.models;

public enum GenderTypes {
    FEMALE ("Female"),
    MALE ("Male"),
    OTHER ("Other");

    final private String name;

    GenderTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
