package com.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Litao-pc on 2016/11/18.
 */
public class Watcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变");
    }

    public Watcher(Observable o){
        o.addObserver(this);
    }


}
