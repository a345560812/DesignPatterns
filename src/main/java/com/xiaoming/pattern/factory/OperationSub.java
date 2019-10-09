package com.xiaoming.pattern.factory;

public class OperationSub extends Operation {
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
