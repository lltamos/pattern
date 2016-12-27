package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
    /**
     * 保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer
     */
    public Subject attach(Observer observer) {
        list.add(observer);
        return this;
    }

    /**
     * 解绑观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notifyObserver(String msg) {
        for (Observer observer :
                list) {
            observer.update(msg);
        }
    }

    public abstract Subject call(Runnable runnable, String msg);


}
