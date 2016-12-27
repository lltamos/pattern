package com.pattern.observer;

/**
 * Created by Litao-pc on 2016/11/17.
 * 具体的角色
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        this.notifyObserver(newState);
    }

    @Override
    public Subject call(Runnable runnable, String msg) {
        runnable.run();
        change(msg);
        return this;
    }
}
