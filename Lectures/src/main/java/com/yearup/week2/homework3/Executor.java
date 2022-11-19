package com.yearup.week2.homework3;

import java.util.Scanner;

public class Executor {
    //3) Create a method in Executor class which checks the input planet name by the user
    //against the enum planet names and displays number of moons returned by Enum class.
    //(tip: use a for loop to check the user planet against all planet names.)

    public int compareInput() {
        //ask user for planet name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Planet");
        String planetInput = scan.next();

       for (PlanetName planet : PlanetName.values()) { // for each planetname
           if (planetInput.equalsIgnoreCase(String.valueOf(planet))) { // if planet is equal in value to planetInput by user return number of moons
               return planet.numOfMoons;
           }
       }
           //else
        return 0;
    }
}
