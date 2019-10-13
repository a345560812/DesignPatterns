package com.xiaoming.pattern.proxy.staticproxy;
/*
静态代理模式
①优点：可以做到符合开闭原则的情况下对目标对象功能进行扩展。
②缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
③和装饰器模式的区别：和装饰器模式很像，装饰器模式分别需要一个抽象装饰器和多个具体装饰器来完成对目标类功能的增强扩展。
我写的装饰器模式中没有让装饰者和被装饰者都去实现同一个接口（原因1是因为书上没写， 原因2是装饰器模式的核心理念不在于这个）。
主要了解装饰器模式和代理模式他们关注的地方不一样，前者关注对象的增强，后者关注控制对象的访问。向客户隐藏了对象的具体信息。
差别是:使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
④代理模式是一种结构型的设计模式
 */
public class Main {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
