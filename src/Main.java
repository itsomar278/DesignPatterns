public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        Pizza pizza ;



        director.makeMargaritaPizza(pizzaBuilder);
        pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());


        director.makeChicagoStylePizza(pizzaBuilder);
        pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());


        director.makeMexicanPizza(pizzaBuilder);
        pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());


        director.makeHawaianStylePizza(pizzaBuilder);
        pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());




    }
}