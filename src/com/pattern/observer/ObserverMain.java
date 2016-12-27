package com.pattern.observer;


public class ObserverMain {

    public static void main(String[] args) {


//        //创建主题对象
//        ConcreteSubject subject = new ConcreteSubject();
//        //创建观察者对象
//        Observer observer = new ConcreteObserver();
//        //将观察者对象登记到主题对象上
//        subject.attach(observer);
//        //改变主题对象的状态
//        subject.change("new state");

        Subject update = new ConcreteSubject().attach(new Observer() {
            @Override
            public void update(String state) {
                System.out.println(state);
            }
        }).call(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        }, "litao");


    }
}
