package com.xiaoming.pattern.strategy;

public class CashNormal extends CashSuper{
    public double acceptCash(double money) {
        return money;
    }
}
