package com.xiaoming.pattern.strategy;

public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
}
