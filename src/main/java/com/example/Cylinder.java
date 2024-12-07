package com.example;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }

    @Override
    public String toString() {
        return getName() + " with radius " + radius + " and height " + height;
    }
}
