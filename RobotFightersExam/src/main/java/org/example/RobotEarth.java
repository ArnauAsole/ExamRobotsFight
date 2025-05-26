package org.example;

public class RobotEarth extends Robots {
    private double maxSpeed;
    private String tractionType;

    public RobotEarth(String name, String enterprise, int yearBirth, String logginDate, String locomotion,double maxSpeed, String tractionType) {
        super(name,enterprise,yearBirth,logginDate,locomotion);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getTractionType() {
        return this.tractionType;
    }

    @Override
    public String getTechnicalDescription() {
        return "TankBot, fabricado por RoboCorp en 2022, usa tracción ORUGAS y alcanza hasta 40 km/h.";
    }
}
