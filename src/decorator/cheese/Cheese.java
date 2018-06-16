package decorator.cheese;

import decorator.dough.Pizza;

/**
 * Created by ms on 2018. 6. 16..
 */
public abstract class Cheese extends Pizza {
    @Override
    public abstract String getDescription();
}
