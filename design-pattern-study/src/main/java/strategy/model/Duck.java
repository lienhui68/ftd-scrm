package strategy.model;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * Created by David Li on 2015/12/14.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("I can swim!");
    }

}
