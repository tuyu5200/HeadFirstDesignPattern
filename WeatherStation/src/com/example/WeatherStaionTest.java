package com.example;

import com.example.Impl.CurrentDisplay;
import com.example.Impl.ForestWeather;
import com.example.utils.WeatherDate;

import java.util.Scanner;

/**
 * Program is use
 * Version: 2017/3/21
 * Author: Tuyu
 */
public class WeatherStaionTest  {


    public static void main(String[] args) {

        WeatherDate weatherDate=new WeatherDate();

        //将currentDiapaly 加入观察者（observer），以便接受（WeatherDate）subject的数据更新
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherDate);

        //ForestWeather 加入观察者（observer），以便接受（WeatherDate）subject的数据更新
        ForestWeather forestWeather = new ForestWeather(weatherDate);

        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 or 2 to select the weatherdate:");
        int choose=in.nextInt();
        //weatherDate 进行数据更新
        switch (choose) {
            case 1:
                weatherDate.setMeasurements(25, 20, 50);
                break;
            case 2:
                forestWeather.exitObservable();
                weatherDate.setMeasurements(20,15,30);
                break;
            default:
                System.out.println("you select none！");
        }



        //currentDisplay.display();


    }
}
