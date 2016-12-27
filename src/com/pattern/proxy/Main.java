package com.pattern.proxy;

public class Main {

    public static void main(String[] args) {
        Server bind = (Server) new Log().bind(new ServerImpl());
        bind.sayHello();
    }
}
