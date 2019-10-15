package com.xiaoming.pattern.builder;

public class Outer {
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    private Outer(Builder builder) {
        this.age = builder.age;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
        this.desc = builder.desc;
    }

    public static class Builder {
        //可选参数
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder() {
        }

        public Builder age(int val) {
            this.age = val;
            return this;
        }

        public Builder sex(String val) {
            this.sex = val;
            return this;
        }

        public Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public Builder desc(String val) {
            this.desc = val;
            return this;
        }

        public Outer build() {
            return new Outer(this);
        }


    }

    @Override
    public String toString() {
        return "Outer{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
