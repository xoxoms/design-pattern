package decorator.dough;

/**
 * Created by ms on 2018. 6. 16..
 */
public class OriginalDough extends Pizza {
    public OriginalDough() {
        this.description = "Original Dough";
    }

    @Override
    public int cost() {
        return 2500;
    }
}
