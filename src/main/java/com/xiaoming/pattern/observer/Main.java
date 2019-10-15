package com.xiaoming.pattern.observer;
/*
观察者设计模式是一种行为型的设计模式,当目标对象数据发生变化时，与之对应的观察者对象数据随之变化
①优点：观察者与被观察者松耦合，可定义一种稳定的消息触发机制。
②缺点：如果被观察者有多个间接的观察者，消息的传递将消耗更多时间，（递归传递）
如果观察者与被观察者之间循环依赖，最终会导致系统崩溃。（单向通信）

 */
public class Main {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
    }
}
