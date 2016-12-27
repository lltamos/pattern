package com.pattern.observer.jdk;

import java.util.Observable;

/**
 * Created by Litao-pc on 2016/11/18.
 */
public class Watched extends Observable {

    private String mData;

    public String getmData() {
        return mData;
    }

    public void setmData(String mData) {

        if (!mData.equals(this.mData)) {
            setChanged();
            this.mData = mData;
        }
        super.notifyObservers();

    }


}
