package com.xiaoming.pattern.factory;

public class OperationFactory {
    public static Operation createOperate(char ope) {
        Operation operation = null;
        switch (ope) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
        }
        return operation;
    }
}
