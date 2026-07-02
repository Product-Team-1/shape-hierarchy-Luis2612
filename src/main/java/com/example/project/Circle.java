package com.example.project;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Si el radio es menor o igual a 0, retorna 0
        if (radius <= 0) {
            return 0;
        }
        // Fórmula del área: pi * radio al cuadrado
        return Math.PI * radius * radius;
    }
}
