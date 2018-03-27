package com.sarahhanley.iFoster.models;

public class FosterType {
    private boolean medicalFoster;
    private boolean temporaryFoster;
    private boolean permanentFoster;
    private boolean puppyFoster;

    public FosterType(boolean medicalFoster, boolean temporaryFoster, boolean permanentFoster, boolean puppyFoster) {
        this.medicalFoster = medicalFoster;
        this.temporaryFoster = temporaryFoster;
        this.permanentFoster = permanentFoster;
        this.puppyFoster = puppyFoster;
    }

    public FosterType() {}

    public boolean isMedicalFoster() {
        return medicalFoster;
    }

    public void setMedicalFoster(boolean medicalFoster) {
        this.medicalFoster = medicalFoster;
    }

    public boolean isTemporaryFoster() {
        return temporaryFoster;
    }

    public void setTemporaryFoster(boolean temporaryFoster) {
        this.temporaryFoster = temporaryFoster;
    }

    public boolean isPermanentFoster() {
        return permanentFoster;
    }

    public void setPermanentFoster(boolean permanentFoster) {
        this.permanentFoster = permanentFoster;
    }

    public boolean isPuppyFoster() {
        return puppyFoster;
    }

    public void setPuppyFoster(boolean puppyFoster) {
        this.puppyFoster = puppyFoster;
    }
}
