public class Director {

    public void makeMargaritaPizza(PizzaBuilder pizzaBuilder)
    {
        System.out.println("Making Margarita Pizza");
        pizzaBuilder.setCheeseType(Cheese.Normal);
        pizzaBuilder.setSauceType(Sauce.Tomato);
        pizzaBuilder.setDoughType(Dough.Thin);
        pizzaBuilder.setToppingType(Topping.None);
    }
    public void makeMexicanPizza(PizzaBuilder pizzaBuilder)
    {
        System.out.println("Making Mexican Pizza");
        pizzaBuilder.setCheeseType(Cheese.Normal);
        pizzaBuilder.setSauceType(Sauce.Barbecue);
        pizzaBuilder.setDoughType(Dough.Normal);
        pizzaBuilder.setToppingType(Topping.meat);
    }

    public void makeChicagoStylePizza(PizzaBuilder pizzaBuilder)
    {
        System.out.println("Making Chicago Style Pizza");
        pizzaBuilder.setCheeseType(Cheese.Double);
        pizzaBuilder.setSauceType(Sauce.Tomato);
        pizzaBuilder.setDoughType(Dough.Thick);
        pizzaBuilder.setToppingType(Topping.None);
    }

    public void makeHawaianStylePizza(PizzaBuilder pizzaBuilder)
    {
        System.out.println("Making Hawaian Style Pizza");
        pizzaBuilder.setCheeseType(Cheese.Normal);
        pizzaBuilder.setSauceType(Sauce.Tomato);
        pizzaBuilder.setDoughType(Dough.Thin);
        pizzaBuilder.setToppingType(Topping.Pineapple);
    }


}
