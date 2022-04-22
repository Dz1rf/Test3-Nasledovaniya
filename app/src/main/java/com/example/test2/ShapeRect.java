package com.example.test2;

public class ShapeRect extends Shape {
    private double L1;
    private double L2;

    public ShapeRect (double L1, double L2) {
        this.L1 = L1;
        this.L2 = L2;
    }

    public double area() {
        return L1 * L2;
    }

}
