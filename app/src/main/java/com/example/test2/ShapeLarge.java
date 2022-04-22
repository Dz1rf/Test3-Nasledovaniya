package com.example.test2;

public class ShapeLarge extends Shape{

        private double LargeS1;
        private double LargeS2;

        public ShapeLarge(double LargeS1, double LargeS2) {
            this.LargeS1 = LargeS1;
            this.LargeS2 = LargeS2;
        }

        public double area () {
            if (LargeS1 > LargeS2)
                return LargeS1;
            else
                return LargeS2;
        }
    }

