package com.yearup.week2.homework3;

import java.util.Scanner;

public enum PlanetName {
    //Create an Enum class called PlanetName with all planet names and number of moons.
    //Mercury, Earth, Mars, Jupiter, Uranus, Neptune

    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    JUPITER(80),
    SATURN(83),
    URANUS(27),
    NEPTUNE(14);

    final int numOfMoons;
    //final so it cannot be reassigned/changed

    PlanetName (int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }

    //Create a method which returns the number of moons as integer and accepts the planet
    //name as string
    public static int returnNumOfMoons() {
        //ask user for planet name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Planet");
        String planetInput = scan.next();

        //return the number of moons
        switch (planetInput) {
            case "Mercury":
                return 0;
            case "Venus":
                return 0;
            case "Earth":
                return 1;
            case "Mars":
                return 2;
            case "Jupiter":
                return 90;
            case "Saturn":
                return 83;
            case "Uranus":
                return 27;
            case "Neptune":
                return 14;
        }
        //else
        return 0;
    }
}
