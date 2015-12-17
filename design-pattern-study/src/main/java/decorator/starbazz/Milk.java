package decorator.starbazz;

/**
 * Created by David Li on 2015/12/16.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Milk";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }
}
