package decorator.cheese;

import decorator.cheese.Cheese;
import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class Mozzarella extends Cheese {
    private Pizza pizza;

    public Mozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella";
    }

    @Override
    public int cost() {
        return 1000 + pizza.cost();
    }
}
