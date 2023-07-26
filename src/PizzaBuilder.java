public class PizzaBuilder implements IBuilder{
    private Cheese cheese;

    private Sauce sauce;
    private Dough dough;
    private Topping topping;
    @Override
    public void setCheeseType(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setSauceType(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setDoughType(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setToppingType(Topping topping) {
        this.topping = topping;
    }

    public Pizza getPizza(){
        return new Pizza(cheese, sauce, dough, topping);
    }


}
