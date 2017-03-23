package com.example.Impl;

import com.example.Interface.DisplayElements;
import com.example.utils.WeatherDate;

import java.net.SocketTimeoutException;
import java.util.Observable;
import java.util.Observer;

/**
 * Program is use
 * Version: 2017/3/22
 * Author: Tuyu
 */
public class ForestWeather implements Observer,DisplayElements{

    private float temperature;
    private float humidity;
    private float pressure;

    Observable observable;

    /**
     * 申请注册成为WeatherDate的observer
     * @param observable
     */
    public ForestWeather(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 申请退出observer，以后将不在接收subject（WeatherDate）的消息
     */
    public void exitObservable() {
        observable.deleteObserver(this);

        System.out.println("observer : " + this.getClass().getName() + " is exit Observer!");

    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDate) {

            WeatherDate weatherDate = (WeatherDate) obs;

            this.temperature = weatherDate.getTemperature();
            this.pressure = weatherDate.getPressure();
            this.humidity = weatherDate.getHumidity();

            display();
        } else {
            System.out.println("There is no observer");
        }
    }


    @Override
    public void display() {
        System.out.println("ForestWeather: Temperature :  " + temperature + " humidity : " + humidity + " pressure : " + pressure);

    }
}
