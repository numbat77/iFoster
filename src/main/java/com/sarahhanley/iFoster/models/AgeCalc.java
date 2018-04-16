package com.sarahhanley.iFoster.models;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static LocalDate currentDate = LocalDate.now();

    public static String calculateAge(LocalDate birthDay) {
        Period age = Period.between(birthDay, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        String yearsAndMonths = years + " year(s) " + months + " month(s)";

        return yearsAndMonths;
    }

}
