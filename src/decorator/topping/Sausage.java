package decorator.topping;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class Sausage extends Topping {
    private Pizza pizza;
    public Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Sausage";
    }

    @Override
    public int cost() {
        return pizza.cost() + 1000;
    }
}
