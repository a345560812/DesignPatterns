package com.xiaoming.pattern.factorymethod;

abstract public class Product {
    public abstract void show();
}

class ProductA extends Product {

    @Override
    public void show() {
        System.out.println("生产出产品A");
    }
}

class ProductB extends Product {

    @Override
    public void show() {
        System.out.println("生产出产品B");
    }
}