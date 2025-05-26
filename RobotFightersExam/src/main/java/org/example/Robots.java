package org.example;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public abstract class Robots {
    private String name;
    private String enterprise;
    private Year yearBirth;
    private LocalDate logginDate;

    public Robots(String name, String enterprise, Year yearBirth, LocalDate logginDate) {
        this.name = name;
        this.enterprise = enterprise;
        this.yearBirth = yearBirth;
        this.logginDate = logginDate;
    }

    public String getName() {
        return this.name;
    }
    public String getEnterprise() {
        return this.enterprise;
    }
    public Year getYearBirth() {
        return this.yearBirth;
    }
    public LocalDate getLogginDate() {
        return this.logginDate;
    }


    public abstract String getTechnicalDescription();
}
