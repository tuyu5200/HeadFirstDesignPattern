package Impl;

import behaviors.QuackBehavior;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
