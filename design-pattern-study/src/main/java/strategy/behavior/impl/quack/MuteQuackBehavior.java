package strategy.behavior.impl.quack;

import strategy.behavior.QuackBehavior;

/**
 * Created by David Li on 2015/12/14.
 */
public class MuteQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
