/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("сырок")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("чикага стайл чиз пицца");

        } else if (item.equals("*********")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("pid***kaya");

        } else if (item.equals("ракушки")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("чикага стайл ракушки");

        } else if (item.equals("пеп")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("чикага стайл пеп");

        }
        return pizza;
    }
}