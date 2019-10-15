package com.xiaoming.pattern.factorymethod;
/*
工厂方法模式
①优点:在增加修改新的运算类的时候不用修改代码，只需要增加对应的工厂就好，完全符合开放——封闭性原则！
创建对象的细节完全封装在具体的工厂内部，而且有了抽象的工厂类，所有的具体工厂都继承了自己的父类！完美的体现了多态性！
②缺点:在增加新的产品时，也必须增加新的工厂类，会带来额外的开销

 */
public class Main {
    public static void main(String[] args) {
        Factory a = new FactoryA();
        a.manufacture().show();
        Factory b = new FactoryB();
        b.manufacture().show();
    }
}
