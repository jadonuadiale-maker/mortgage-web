package com.example.demo;

public class MortgageRequest {
    private int principal;
    private double rate;
    private int years;

    //Getters and setters
    public int getPrincipal() {
        return principal;
    }
    public void setPrincipal(int principal) {
        this.principal = principal;
    }
    
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
}
