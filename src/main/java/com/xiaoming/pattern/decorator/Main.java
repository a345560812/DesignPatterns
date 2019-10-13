package com.xiaoming.pattern.decorator;
/*
①装饰器模式是一种结构型的设计模式。
②装饰器模式在不使用继承和不改变原类文件的情况下，动态的扩展一个对象的功能。
它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
③装饰器模式和继承的共同特点就是扩展对象的功能，而装饰器模式比继承更加灵活.
通过使用不同的具体装饰器类，及其不同的排列组合，可以产生出大量不同的组合.
装饰器是对现有的对象进行灵活(顺序、功能上)增强，继承是基于基类来增强固定功能会使得类体系结构臃肿庞大。
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        TShirts ts = new TShirts();
        BigTrouser bt = new BigTrouser();
        NewTrouser nt = new NewTrouser();
        ts.Decorate(person);
        bt.Decorate(ts);
        nt.Decorate(bt);
        nt.show();
    }
}
