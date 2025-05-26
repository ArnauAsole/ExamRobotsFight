package org.example;

import java.time.LocalDate;
import java.time.Year;

public class RobotEarth extends Robots {
    private double maxSpeed;
    private Traction tractionType;

    public RobotEarth(String name, String enterprise, Year yearBirth, LocalDate logginDate, double maxSpeed, Traction tractionType) {
        super(name,enterprise,yearBirth,logginDate);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public Traction getTractionType() {
        return this.tractionType;
    }

    @Override
    public String getTechnicalDescription() {
        return "The land robot called " + getName() + ", manufactured by " + getEnterprise() +
                ", in: " + getYearBirth() + ". Is logged in the competition in this date: " + getLogginDate() +
                ". Is able to reach " + this.maxSpeed + "km/h and runs by " + getTractionType() ;
    }


    public String getResistanceReport() {
        if (tractionType == Traction.ORUGAS) {
            return String.format("✅ %s is suitable for extreme terrain (tracked traction).", getName());
        }
        return String.format("❌ %s is not suitable (requires orugas traction).", getName());
    }

}
