package com.example;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public String toString() {
        return getName() + " with radius " + radius;
    }
}
