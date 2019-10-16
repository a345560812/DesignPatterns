package com.xiaoming.pattern.state;

public abstract class State {
    public abstract void handle(Context context);
}

class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态为A");
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态为B");
        context.setState(new ConcreteStateA());
    }
}