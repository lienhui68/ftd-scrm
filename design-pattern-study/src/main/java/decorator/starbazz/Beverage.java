package decorator.starbazz;

/**
 * Created by David Li on 2015/12/16.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
