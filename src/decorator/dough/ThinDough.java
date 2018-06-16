package decorator.dough;

/**
 * Created by ms on 2018. 6. 16..
 */
public class ThinDough extends Pizza {
    public ThinDough() {
        this.description = "Thin Dough";
    }

    @Override
    public int cost() {
        return 3000;
    }
}
