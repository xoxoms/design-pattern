package decorator.dough;

/**
 * Created by ms on 2018. 6. 16..
 */
public abstract class Pizza {
    String description;

    public String getDescription() {
        return description;
    }
    public abstract int cost();
}
