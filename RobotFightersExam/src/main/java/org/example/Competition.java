package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Competition {
    private final List<Robots> registeredRobots;

    public Competition(List<Robots> registeredRobots) {
        this.registeredRobots = registeredRobots;
    }
    public void addRobot(Robots robot) {
        registeredRobots.add(robot);
    }
    public void listAllRobots() {
        registeredRobots.forEach(r -> System.out.println(r.getTechnicalDescription()));
    }

    public List<RobotEarth> filterEarthRobotsBySpeed(int minSpeed) {
        return registeredRobots.stream()
                .filter(r -> r instanceof RobotEarth)
                .map(r -> (RobotEarth) r)
                .filter(r -> r.getMaxSpeed() > minSpeed)
                .collect(Collectors.toList());
    }

    public String BrandRobots(String enterprise) {
        String response = "";
        for (Robots robot : registeredRobots) {
            if(robot.getEnterprise().equalsIgnoreCase(enterprise)) {
                response = robot.getTechnicalDescription();
            }
        }
        return response;
    }
}
