package beans;

import Impl.FlyWithWings;
import Impl.Quack;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class MallarDuck extends Duck {

    public MallarDuck(String catorgreate) {
        super(catorgreate);
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is a MallarDuck!");
    }

}
