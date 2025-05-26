package org.example;

import java.time.LocalDate;
import java.time.Year;

public class RobotWind extends Robots{
    private double maxHigh;
    private double autonomy;

    public RobotWind(String name, String enterprise, Year yearBirth, LocalDate logginDate, double maxHigh, double autonomy) {
        super(name,enterprise,yearBirth,logginDate);
        this.maxHigh = maxHigh;
        this.autonomy = autonomy;
    }

    public double getMaxHigh() {
        return this.maxHigh;
    }

    public double getAutonomy() {
        return this.autonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return "Air robot called " + getName() + ", manufactured by " + getEnterprise() +
                ", in: " + getYearBirth() + ". Is logged in the competition in this date: " + getLogginDate() +
                ". Is able to reach " + this.maxHigh + "m and is able to fly for " + this.autonomy + "minutes." ;
    }

    public String getResistanceReport() {
        if (autonomy >= 60) {
            return String.format("✅ %s is suitable for extreme flight endurance (autonomy: %d min).",
                    getName(), autonomy);
        }
        return String.format("❌ %s is not suitable (autonomy must be ≥ 60 min, has %d min).",
                getName(), autonomy);
    }
}

