package com.example.project;

import java.util.ArrayList;

public class ShapeHierarchy {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Triangle(6, 4));
        shapes.add(new Circle(0));       // caso borde: radio cero
        shapes.add(new Rectangle(-4, 5)); // caso borde: valor negativo
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.getArea());
        }
    }
}
