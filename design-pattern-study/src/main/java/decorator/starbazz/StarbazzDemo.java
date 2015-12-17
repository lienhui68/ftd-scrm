package decorator.starbazz;

/**
 * Created by David Li on 2015/12/16.
 */
public class StarbazzDemo {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.printf("%s%n%f%n", espresso.getDescription(), espresso.cost());

        espresso = new Milk(espresso);
        System.out.printf("%s%n%f%n", espresso.getDescription(), espresso.cost());

        espresso = new Mocha(espresso);
        System.out.printf("%s%n%f%n", espresso.getDescription(), espresso.cost());

    }
}
