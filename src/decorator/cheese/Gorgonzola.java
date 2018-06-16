package decorator.cheese;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class Gorgonzola extends Cheese {
    private Pizza pizza;
    public Gorgonzola(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Gorgonzola";
    }

    @Override
    public int cost() {
        return pizza.cost() + 500;
    }
}
