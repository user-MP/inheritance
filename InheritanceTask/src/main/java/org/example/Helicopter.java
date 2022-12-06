package org.example;

public class Helicopter extends Aircraft {

    private double diameterTailRotor;

    private double lengthRotorBlade;

    public Helicopter() {

    }

    public Helicopter(String name, int countEngines, double height, double weight, double length,
                      int maxFlyRange, int maxSpeed, int countCrew,
                      double diameterTailRotor, double lengthRotorBlade) {

        super(name, countEngines, height, weight, length, maxFlyRange, maxSpeed, countCrew);


        this.diameterTailRotor = diameterTailRotor;
        this.lengthRotorBlade = lengthRotorBlade;
    }


    public double getDiameterTailRotor() {

        return diameterTailRotor;
    }


    public void setDiameterTailRotor(double diameterTailRotor) {

        this.diameterTailRotor = diameterTailRotor;


    }

    public double getLengthRotorBlade() {
        return lengthRotorBlade;
    }

    public void setLengthRotorBlade(double lengthRotorBlade) {
        this.lengthRotorBlade = lengthRotorBlade;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Diameter tail rotor : " + diameterTailRotor + " m" +
                "\nLengthRotorBlade : " + lengthRotorBlade + " m\n";
    }


}

