package org.example;

public class RobotWater extends Robots{
    private double maxDeep;
    private String propulsionType;

    public RobotWater(String name, String enterprise, int yearBirth, String logginDate, String locomotion,double maxDeep, String propulsionType) {
        super(name,enterprise,yearBirth,logginDate,locomotion);
        this.maxDeep= maxDeep;
        this.propulsionType = propulsionType;
    }

    public double getMaxDeep() {
        return this.maxDeep;
    }

    public String getPropulsionType() {
        return this.propulsionType;
    }

    @Override
    public String getTechnicalDescription() {
        return "AquaRunner alcanza una profundidad de 500 m con propulsión tipo HÉLICE. Fabricado por AquaTech en 2021.";
    }
}

