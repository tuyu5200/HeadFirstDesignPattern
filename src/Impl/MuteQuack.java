package Impl;

import behaviors.QuackBehavior;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack~");
    }
}
