package org.example;

import java.time.LocalDate;
import java.time.Year;

public class RobotWater extends Robots{
    private double maxDeep;
    private Propulsion propulsionType;

    public RobotWater(String name, String enterprise, Year yearBirth, LocalDate logginDate, double maxDeep, Propulsion propulsionType) {
        super(name,enterprise,yearBirth,logginDate);
        this.maxDeep= maxDeep;
        this.propulsionType = propulsionType;
    }

    public double getMaxDeep() {
        return this.maxDeep;
    }

    public Propulsion getPropulsionType() {
        return this.propulsionType;
    }

    @Override
    public String getTechnicalDescription() {
        return "Aquatic robot called " + getName() + ", manufactured by " + getEnterprise() +
                ", in: " + getYearBirth() + ". Is logged in the competition in this date: " + getLogginDate() +
                ". Is able to reach " + this.maxDeep + "m and is propulsed by " + getPropulsionType() ;
    }
}

