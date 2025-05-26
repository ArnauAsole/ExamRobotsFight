package org.example;

import java.util.Date;

public abstract class Robots {
    private String name;
    private String enterprise;
    private int yearBirth;
    private String logginDate;
    private String locomotion;

    public Robots(String name, String enterprise, int yearBirth, String logginDate,String locomotion) {
        this.name = name;
        this.enterprise = enterprise;
        this.yearBirth = yearBirth;
        this.logginDate = logginDate;
        this.locomotion = locomotion;
    }

    public String getName() {
        return this.name;
    }
    public String getEnterprise() {
        return this.enterprise;
    }
    public int getYearBirth() {
        return this.yearBirth;
    }
    public String getLogginDate() {
        return this.logginDate;
    }

    public String getLocomotion() {
        return this.locomotion;
    }

    public String getTechnicalDescription() {
        return "im a robot.";
    }
}
