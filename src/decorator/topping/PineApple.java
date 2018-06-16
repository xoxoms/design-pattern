package decorator.topping;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public class PineApple extends Topping {
    private Pizza pizza;
    public PineApple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", PineApple";
    }

    @Override
    public int cost() {
        return pizza.cost() + 700;
    }
}
