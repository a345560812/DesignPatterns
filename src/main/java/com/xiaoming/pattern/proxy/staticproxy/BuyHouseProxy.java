package com.xiaoming.pattern.proxy.staticproxy;

public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse house) {
        this.buyHouse = house;
    }
    @Override
    public void buyHosue() {
        System.out.println("看房并准备");
        buyHouse.buyHosue();
        System.out.println("买房后进行装修吸甲醛");
    }
}
