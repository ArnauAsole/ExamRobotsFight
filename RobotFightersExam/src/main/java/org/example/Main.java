package org.example;

import java.util.List; // ✅ Correct!
import java.util.ArrayList; // If you're using ArrayList too
import java.time.LocalDate;
import java.time.Year;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Robots> registeredRobots = new ArrayList<>();

        registeredRobots.add(new RobotEarth("T-1000", "RoboCorp", Year.of(2022), LocalDate.now(), 40, Traction.ORUGAS));
        registeredRobots.add(new RobotEarth("Wallie", "Apple", Year.of(2023), LocalDate.now(), 70, Traction.RUEDAS));
        registeredRobots.add(new RobotWater("IronGiant", "Aquatic", Year.of(2021), LocalDate.now(), 500, Propulsion.HELICE));
        registeredRobots.add(new RobotWind("SpaceBalls", "SpaceX", Year.of(2023), LocalDate.now(), 3000, 90));
        registeredRobots.add(new RobotWater("LifeAquatic","JacquesCosteau", Year.of(2022),LocalDate.now(),1000,Propulsion.CHORRO));

        Competition competition = new Competition(registeredRobots);

        System.out.println("All Registered Robots:");
        competition.listAllRobots();


        System.out.println("RobotEarth with speed > 50 km/h:");
        competition.filterEarthRobotsBySpeed(50)
                .forEach(r -> System.out.println(r.getTechnicalDescription()));

    }
}
