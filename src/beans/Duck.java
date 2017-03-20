package beans;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public abstract class Duck {
    private String catorgreate;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public Duck(String catorgreate) {
        this.catorgreate = catorgreate;
    }

    public void performFly() {
        flyBehavior.fly();   //委托给行为类
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    /**
     * 动态改变飞行行为
     * @param fb 飞行的种类
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior=fb;
    }

    /**
     * 动态改变叫的行为
     * @param qb 叫的种类
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior=qb;
    }
}
