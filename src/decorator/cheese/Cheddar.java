package decorator.cheese;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class Cheddar extends Cheese {
    private Pizza pizza;

    public Cheddar(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheddar";
    }

    @Override
    public int cost() {
        return pizza.cost() + 1200;
    }
}
