public class Pizza {
    private final Cheese cheese;
    private final Sauce sauce;
    private final Dough dough;
    private final Topping topping;
    public Pizza(Cheese cheese, Sauce sauce, Dough dough, Topping topping){
        this.cheese = cheese;
        this.sauce = sauce;
        this.dough = dough;
        this.topping = topping;
    }
    public Cheese getCheese(){
        return cheese;
    }
    public Sauce getSauce(){
        return sauce;
    }
    public Dough getDough(){
        return dough;
    }
    public Topping getTopping(){
        return topping;
    }

    @Override
    public String toString() {
        return "Contents of this pizza : {" +
                "cheese=" + getCheese() +
                ", sauce=" + getSauce() +
                ", dough=" + getDough() +
                ", topping=" + getTopping() +
                '}';
    }

}
