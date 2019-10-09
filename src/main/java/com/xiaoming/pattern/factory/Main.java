package com.xiaoming.pattern.factory;
/*
①简单工厂模式属于创建型模式，根据外界给定的信息来决定究竟创建哪个具体类的实例。
②降低了程序的耦合性，增加了程序的可扩展性。该种模式集中了所有实例的创建逻辑，违反了高内聚责任分配原则。
③适合在工厂类创建的对象比较少，客户端只知道传入参数，对于创建对象的过程逻辑不关心的时候，就是在很简单的情况下使用。
书中通过计算器为例学习了简单工厂模式的使用。
 */
public class Main {
    public static void main(String[] args) {
        // 计算器demo
        Operation ope;
        ope = OperationFactory.createOperate('+');
        ope.setNumberA(1);
        ope.setNumberB(2);
        System.out.println(ope.getResult());
    }
}
