package beans;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

/**
 * Program is not extends Duck class,but it can realise it`s own methods.  tip:more use combine instead of extends.
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class DuckCall {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public DuckCall(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        System.out.println("This is a DuckCall");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior=qb;
    }
}
