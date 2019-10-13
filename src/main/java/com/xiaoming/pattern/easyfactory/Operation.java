package com.xiaoming.pattern.easyfactory;

public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;
    private double result = 0;
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double val) {
        this.numberA = val;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double val) {
        this.numberB = val;
    }

    public abstract double getResult();
}
