package com.example.Interface;

/**
 * Program is use
 * Version: 2017/3/20
 * Author: Tuyu
 */
public interface Subjects {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
