package com.xiaoming.pattern.strategy;
/* 在策略模式中，一个类的行为或者算法可以在运行时更改，这种类型的设计模式属于行为型模式。
①将每一种算法都封装到具有共同接口的独立的类中，从而是它们可以相互替换。
②策略模式的最大特点是使得算法可以在不影响客户端的情况下发生变化，从而改变不同的功能。
③体现了封装变化的概念以及编程中使用接口，而不是使用的是具体的实现类(面向接口编程)。
④可以回忆一下TreeSet的设计，我们可以自己实现Comparator接口来控制该集合接收元素的语义。
⑤ 在CashContext类的构造函数当中又使用了简单工厂模式， 完成了简单工厂模式和策略模式的结合使用。
*/
public class Main {
    public static void main(String[] args) {
        CashContext cc = new CashContext("打8折");
        double totalPrices = cc.getResult(200d);
        System.out.println("花费1:" + totalPrices);
        cc = new CashContext("满300减100");
        double totalPrices2 = cc.getResult(410);
        System.out.println("花费2:" + totalPrices2);

    }
}
