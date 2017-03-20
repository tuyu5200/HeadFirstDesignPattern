package com.example.utils;

import com.example.Interface.Observer;
import com.example.Interface.Subjects;

import java.util.ArrayList;

/**
 * Program is use
 * Version: 2017/3/20
 * Author: Tuyu
 */
public class WeatherDate implements Subjects {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
        this.observers=new ArrayList() ;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        if (observers.indexOf(observer) >= 0) {
            observers.remove(observers.indexOf(observer));
        }
    }

    /**
     * 把每一个状态都告诉每一个观察者，因为每一个观察者都实现了update方法
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);

            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当有值更新时，此方法就会被调用
     */
    public void measurementsChanged() {
        notifyObserver();

    }

    /**
     * 将从外界实时更新的数据传入进来，可以写代码从网上抓取观测值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        //有更新就会调用
        measurementsChanged();
    }
}
