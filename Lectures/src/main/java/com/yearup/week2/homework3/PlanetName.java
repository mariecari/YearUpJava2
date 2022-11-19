package com.yearup.week2.homework3;

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

}
