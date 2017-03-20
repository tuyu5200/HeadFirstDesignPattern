package Impl;

import behaviors.FlyBehavior;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly!");
    }
}
