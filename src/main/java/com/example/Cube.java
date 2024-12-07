package com.example;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public String toString() {
        return getName() + " with side " + side;
    }
}
