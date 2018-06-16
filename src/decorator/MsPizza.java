package decorator;

import decorator.cheese.Cheddar;
import decorator.cheese.Gorgonzola;
import decorator.cheese.Mozzarella;
import decorator.dough.Pizza;
import decorator.dough.ThinDough;
import decorator.topping.PineApple;
import decorator.topping.Sausage;
import decorator.topping.Tomato;

/**
 * Created by ms on 2018. 6. 16..
 */
public class MsPizza {
    public static void main(String[] args) {
        Pizza thinDough = new ThinDough();
        Pizza cheddar = new Cheddar(thinDough);
        Pizza mozzarella = new Mozzarella(cheddar);
        Pizza gorgonzola = new Gorgonzola(mozzarella);
        PineApple pineApple = new PineApple(gorgonzola);
        Sausage sausage = new Sausage(pineApple);
        Tomato tomato = new Tomato(sausage);

        System.out.println("it is ================");
        System.out.println(tomato.getDescription());
        System.out.println("cost is ==============");
        System.out.println(tomato.cost());
    }
}
