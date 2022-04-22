package com.example.test2;

public class Main {
    public static void main(String[] args) {
        Shape ShapeN = new ShapeCircle(8.0);
        Shape ShapeN1 = new ShapeRect(5.0, 6.0);
        Shape Large = new ShapeLarge(ShapeN.area(), ShapeN1.area());
        System.out.println(ShapeN.area());
        System.out.println(ShapeN1.area());
        System.out.println(Large.area());
        ShapeCircleN ShapeN2 = new ShapeCircleN(4);
        System.out.println(ShapeN2.area());
    }
}
