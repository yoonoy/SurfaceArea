package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> {
                    double radius = 1 + random.nextDouble() * 9;
                    shapes.add(new Sphere(radius));
                }
                case 1 -> {
                    double radius = 1 + random.nextDouble() * 9;
                    double height = 5 + random.nextDouble() * 15;
                    shapes.add(new Cylinder(radius, height));
                }
                case 2 -> {
                    double side = 1 + random.nextDouble() * 9;
                    shapes.add(new Cube(side));
                }
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println();
        }
    }
}
