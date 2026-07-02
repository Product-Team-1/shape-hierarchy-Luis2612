package com.example.project;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        // Si el ancho o alto es menor o igual a 0, retorna 0
        if (width <= 0 || height <= 0) {
            return 0;
        }
        return width * height;
    }
}
