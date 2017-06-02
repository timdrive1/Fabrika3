/**
 * Created by Тим on 02.06.2017.
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("сырок")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("нью йорк стайл чиз");

        } else if (item.equals("*********")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("нью йорк стайл пид********");

        } else if (item.equals("ракушки")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("нью йорк стайл ракушки");

        } else if (item.equals("пеп")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("нью йорк стайл пеп");

        }
        return pizza;
    }
}