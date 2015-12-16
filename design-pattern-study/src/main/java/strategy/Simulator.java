package strategy;

import strategy.behavior.impl.fly.FlyNoWayBehavior;
import strategy.model.Duck;
import strategy.model.MallardDuck;

/**
 * Created by David Li on 2015/12/14.
 */
public class Simulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWayBehavior());
        duck.performFly();
    }
}
