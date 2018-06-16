package decorator.topping;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public abstract class Topping extends Pizza {
    @Override
    public abstract String getDescription();
}
