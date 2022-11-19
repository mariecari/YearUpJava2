package com.yearup.week2.homework3;

public class CelestialObject {
    //1) Create an anonymous class called CelestialObject. This should implement an interface
    //with the same name and one method to displayCelestialobject().
    //2) Override the method and display “Comet is a celestial object”

    class CelestialObject1 implements com.yearup.week2.homework3.CelestialObject1 {

        @Override
        public void displayCelestialobject() {
            System.out.println("Comet is a celestial object");
        }
    }

}
