package decorator.starbazz;

/**
 * Created by David Li on 2015/12/16.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
