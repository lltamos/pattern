package com.pattern.observer.jdk;

import java.util.Observer;


public class Test {

    public static void main(String[] args) {
        Watched w=new Watched();

        Observer observer=new Watcher(w);
        w.setmData("hello");
    }
}
