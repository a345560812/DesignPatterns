package com.xiaoming.pattern.absfactory;
/*
抽象工厂模式相比工厂模式提高了更高一级的抽象，专门针对涉及多个产品系列的问题。
但是修改很冗余，比如说我需要增加一个价格属性，
那么需要增加priceFactory、Price类,修改FactoryProducer、AbstractFactory。
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color green = colorFactory.getColor("GREEN");
        green.fill();
        Color red = colorFactory.getColor("RED");
        red.fill();

    }
}
