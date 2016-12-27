package com.pattern.observer;

/**
 * Created by Litao-pc on 2016/11/17.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
