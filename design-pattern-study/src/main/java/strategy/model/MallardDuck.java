package strategy.model;

import strategy.behavior.impl.fly.FlyRocketBehavior;
import strategy.behavior.impl.quack.MuteQuackBehavior;

/**
 * Created by David Li on 2015/12/14.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyRocketBehavior());
        setQuackBehavior(new MuteQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("I have a green head!");
    }
}
