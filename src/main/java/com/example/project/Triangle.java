package com.example.project;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        // Si la base o altura es menor o igual a 0, retorna 0
        if (base <= 0 || height <= 0) {
            return 0;
        }
        // Fórmula del área: (base * altura) / 2
        return 0.5 * base * height;
    }
}
