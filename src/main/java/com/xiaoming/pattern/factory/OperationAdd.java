package com.xiaoming.pattern.factory;

public class OperationAdd extends Operation {
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
