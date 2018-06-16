package decorator.topping;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class Tomato extends Topping {
    private Pizza pizza;
    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public int cost() {
        return pizza.cost() + 500;
    }
}
