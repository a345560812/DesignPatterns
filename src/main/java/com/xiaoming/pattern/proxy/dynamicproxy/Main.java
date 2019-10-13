package com.xiaoming.pattern.proxy.dynamicproxy;

import com.xiaoming.pattern.proxy.staticproxy.BuyHouse;
import com.xiaoming.pattern.proxy.staticproxy.BuyHouseImpl;

import java.lang.reflect.Proxy;
/*
①动态代理不需要像静态代理那样再手动创建代理类，而是通过反射，它防止了接口发生变化时代理类必须跟着变化。
②动态代理只支持对interface代理。
JDK实现动态代理需要实现类通过接口定义业务方法，对于没有接口的类，如何实现动态代理呢，这就需要CGLib了。
①CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，
②并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。但因为采用的是继承，
所以不能对final修饰的类进行代理。JDK动态代理与CGLib动态代理均是实现Spring AOP的基础。
 */
public class Main {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        Object ob =  new Object();

        System.out.println("看看:" + buyHouse.getClass());
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        System.out.println("看看2：" + proxyBuyHouse.getClass());
        proxyBuyHouse.buyHosue();
    }
}
