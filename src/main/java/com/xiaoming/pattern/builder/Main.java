package com.xiaoming.pattern.builder;
/*
构建起模式是一种创造型的设计模式。
①
 */
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer.Builder()
                .address("岳阳")
                .age(18)
                .desc("构建器模式")
                .sex("男")
                .build();
        System.out.println(outer.toString());
    }
}
