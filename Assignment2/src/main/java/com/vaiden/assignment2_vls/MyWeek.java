package com.vaiden.assignment2_vls;

import java.util.Arrays;
import java.util.List;

public class MyWeek {
    private String name;

    public MyWeek() {
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return "A description of how the week usually goes for " + name;
    }

    public int getNumberDays() {
        return 7;
    }

    public List<Day> getWorkingDays() {
        return Arrays.asList(Day.THURSDAY, Day.SUNDAY);
    }

    public int getNumberWorkingDays() {
        return this.getWorkingDays().size();
    }

    public int getDaysOff() {
        return getNumberDays() - getNumberWorkingDays();
    }

    public double getWorkPercentage() {
        return (double)getNumberWorkingDays() / (double)getNumberDays()*100;
    }

    public String getPercentage() {
        String message;
        message = "That means " + getName() + " is working " + getWorkPercentage() + "% of the time.";
        if (getNumberWorkingDays() > 5) {
            message += "<br> This is far from ideal :(";
        }
        return message;
    }

}
