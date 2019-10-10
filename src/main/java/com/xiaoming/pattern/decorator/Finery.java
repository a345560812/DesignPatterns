package com.xiaoming.pattern.decorator;

public class Finery extends Person {
    protected Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    public void show() {
        if(component != null) {
            component.show();
        }
    }
}

class TShirts extends Finery{
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}

class BigTrouser extends Finery{
    @Override
    public void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}

class NewTrouser extends Finery{
    @Override
    public void show() {
        System.out.print("新垮裤  ");
        super.show();
    }
}


