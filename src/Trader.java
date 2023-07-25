public class Trader implements IObserver{
    private String Name;

    private Share share;

    private double LastPrice ;

    public Trader(String Name , Share share) {
        this.Name = Name;
        this.share = share;
        LastPrice  = share.getPrice();
    }

    private void buy() {
        System.out.println(Name + ": Price is going down , I will buy more shares in " + share.getCompanyName() );
    }

    private void sell()
    {
        System.out.println(Name + ": Price is going up ,I will sell my shares in " + share.getCompanyName() );
    }

    @Override
    public void update() {
        if (LastPrice  < share.getPrice()) {
            sell();
        } else if (LastPrice  > share.getPrice()) {
            buy();
        }
        LastPrice  = share.getPrice();

    }
}
