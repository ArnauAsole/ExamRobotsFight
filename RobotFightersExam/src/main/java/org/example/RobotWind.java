package org.example;

public class RobotWind extends Robots{
    private double maxHigh;
    private double autonomy;

    public RobotWind(String name, String enterprise, int yearBirth, String logginDate, String locomotion,double maxHigh, double autonomy) {
        super(name,enterprise,yearBirth,logginDate,locomotion);
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
        return "SkyDancer vuela hasta 3000 m durante 90 minutos. Fabricado en 2023 por AeroDynamics.";
    }
}

