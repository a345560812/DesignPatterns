package com.xiaoming.pattern.factorymethod;

public abstract class Factory {
    public abstract Product manufacture();
}

class FactoryA extends Factory {

    @Override
    public Product manufacture() {
        return new ProductA();
    }
}

class FactoryB extends Factory {

    @Override
    public Product manufacture() {
        return new ProductB();
    }
}
