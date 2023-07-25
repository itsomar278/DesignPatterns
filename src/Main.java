
public class Main {
    public static void main(String[] args) {
Share share = new Share("Quiz Plus" , 100.0);
Trader trader1 = new Trader("Ahmed" , share);
share.addObserver(trader1);
share.setPrice(105.0);
share.setPrice(95.0);
share.setPrice(180.0);

    }
}