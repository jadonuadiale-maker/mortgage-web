package com.example.demo;

public class MortgageCalculator {
    
    public double calculate(int principal, double interestRate, int years) {
        final byte ANNUAL = 12;
        final byte PERCENT = 100;

        double r = (interestRate / PERCENT) / ANNUAL;
        double n = years * ANNUAL;
        double x = 1 + r; 
        double y = Math.pow(x, n);
        return principal * ((r * y) / (y - 1));
    }
}
