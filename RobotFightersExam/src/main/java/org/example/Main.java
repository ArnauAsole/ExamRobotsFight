package org.example;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Robots> robots = new ArrayList<Robots>();

        RobotEarth rob1 = new RobotEarth("Wallie","Apple",2008,"2025-05-30" ,75,"Ruedas");
        RobotWater rob2 = new RobotWater("Irobot","Samsung",2010,"2025-05-30" ,100,"Gas");
        RobotWind rob3 = new RobotWind("PontAeri","Linux",2015,"2025-05-30" ,200,300);

        robots.add(rob1);
        robots.add(rob2);
        robots.add(rob3);

        for (Robots robot : robots) {
            System.out.println(robot.getTechnicalDescription());
        }

        for (Robots robot : robots) { // Filtre per velocitat superior a X
            if (robot.getLocomotion().equalsIgnoreCase("terrestre"))
                System.out.println(robot);
            }
        }
        //Falta un foreach per buscar per fabricant
    // Falta el punt 4 també
}
