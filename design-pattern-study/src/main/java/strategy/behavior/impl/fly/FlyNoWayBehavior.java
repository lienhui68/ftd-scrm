package strategy.behavior.impl.fly;

import strategy.behavior.FlyBehavior;

/**
 * Created by David Li on 2015/12/14.
 */
public class FlyNoWayBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
