package com.xiaoming.pattern.prototype;

import java.text.MessageFormat;
/*
①原型设计模式不需要知道任何创建的细节，不调用构造函数的一种创建型设计模式
②使用场景：类初始化比较麻烦消耗资源，new对象过程繁琐，构造函数复杂，循环体中产生大量对象。
③：比直接new一个对象性能高，是二进制流的拷贝，但是必须具备克隆方法，且深拷贝浅拷贝需要深入了解原理。
类成员变量不能有final关键字.
④本单元采用发邮件来实践该模式。 可以想象下某公司给大量候选人发拒信的场景。
消息内容一致，只需要改名称。并且为了保证效率采用多线程发送，那么就可以使用原型设计模式
节省new对象的过程以及避免线程安全问题。(线程安全问题涉及到浅拷贝和深拷贝的原理可以自行深入研究)
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail: " + mail.toString());
        for (int i = 0; i < 10; i++) {
            new Thread( () -> {
                Mail mailTemp = null;
                try {
                    mailTemp = (Mail) mail.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                mailTemp.setName("名称" + Thread.currentThread().getName());
                mailTemp.setContent("恭喜您中奖了。");
                MailUtil.sendMail(mailTemp);
            }).start();
        }

    }
}


