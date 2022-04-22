package com.example.test2;

public class ShapeCircleN {
    final double Pi = Math.PI;
    private double D;

    public ShapeCircleN (double D) {
        this.D = D;
    }

    public double area () {
        double R = D / 2.0;
        return Pi * R * R;
        }
    }

