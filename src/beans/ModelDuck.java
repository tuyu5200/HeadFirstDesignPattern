package beans;

import Impl.FlyNoWay;
import Impl.MuteQuack;
import beans.Duck;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class ModelDuck extends Duck {
    public ModelDuck(String catorgreate) {
        super(catorgreate);
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("This is ModelDuck");
    }


}
