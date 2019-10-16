package com.xiaoming.pattern.state;
/*
状态模式是一种行为型的设计模式。该模式将与特定状态相关的行为局部化，分割了不同状态的行为，
状态模式通过把各种状态转移逻辑分布到State的子类之间来减少相互的依赖。消除了庞大的条件分支语句。
需要了解到面向对象设计的实质就是做到代码的责任分解。
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();

    }
}
