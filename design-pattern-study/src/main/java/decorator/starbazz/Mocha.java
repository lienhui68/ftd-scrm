package decorator.starbazz;

/**
 * Created by David Li on 2015/12/16.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    @Override
    public double cost() {
        return .7 + beverage.cost();
    }
}
