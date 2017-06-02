/**
 * Created by Тим on 02.06.2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("сырок");
        System.out.println("кто-то заказал  " + pizza + "\n");

        pizza = chicagoStore.orderPizza("сырок");
        System.out.println("кто-то заказал " + pizza + "\n");

        pizza = nyStore.orderPizza("ракушки");
        System.out.println("кто-то заказал  " + pizza + "\n");

        pizza = chicagoStore.orderPizza("ракушки");
        System.out.println("кто-то заказал  " + pizza + "\n");

        pizza = nyStore.orderPizza("пеп");
        System.out.println("кто-то заказал  " + pizza + "\n");

        pizza = chicagoStore.orderPizza("пеп");
        System.out.println("кто-то заказал " + pizza + "\n");

        pizza = nyStore.orderPizza("*********");
        System.out.println("кто-то заказал  " + pizza + "\n");

        pizza = chicagoStore.orderPizza("*********");
        System.out.println("кто-то заказал " + pizza + "\n");
    }
}