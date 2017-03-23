package com.example.Impl;

import com.example.Interface.DisplayElements;
//import com.example.Interface.Observer;
import com.example.Interface.Subjects;
import com.example.utils.WeatherDate;

import java.util.Observable;
import java.util.Observer;

/**
 * Program is use
 * Version: 2017/3/21
 * Author: Tuyu
 */
public class CurrentDisplay implements Observer,DisplayElements {
    private float temperature;
    private float humidity;
    Observable observable;
    //private Subjects weatherDate;

    //public CurrentDisplay(Subjects weatherDate) {
        //this.weatherDate = weatherDate;
        //weatherDate.registerObserver(this);

    //}

    /**
     * 申请注册成为WeatherDate的observer
     * @param observable
     */
    public CurrentDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    //
    //@Override
    //public void update(float temp, float humidity, float pressure) {
    //    this.temperature=temp;
    //    this.humidity=humidity;
    //    display();
    //}

    @Override
    public void display() {
        System.out.println("Current temperature is: " + temperature + " humidity is : " + humidity);
    }


    @Override
    public void update(Observable obs, Object arg) {

        if (obs instanceof WeatherDate) {

            WeatherDate weatherDate= (WeatherDate) obs;

            this.temperature=weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();

            display();
        }
    }
}
