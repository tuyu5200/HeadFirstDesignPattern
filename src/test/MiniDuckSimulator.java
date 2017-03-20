package test;

import Impl.FlyNoWay;
import Impl.FlyRocketPowerd;
import Impl.MuteQuack;
import Impl.Squeak;
import beans.Duck;
import beans.DuckCall;
import beans.MallarDuck;
import beans.ModelDuck;

/**
 * Program is use
 * Version: 2017/3/17
 * Author: Tuyu
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck("mallarDuck ");
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        System.out.println("-----------------------------------------------------");

        Duck modelDuck = new ModelDuck("ModelDuck");
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("----------------------动态改变行为--------------------------------");

        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.performQuack();
        System.out.println("-----------------------------------------------------");

        DuckCall duckCall = new DuckCall(new FlyNoWay(), new MuteQuack());
        duckCall.performFly();
        duckCall.performQuack();
        duckCall.setQuackBehavior(new Squeak());
        duckCall.performQuack();
    }
}
