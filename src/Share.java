import java.util.ArrayList;
import java.util.List;

public class Share implements IObservable {
    private String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
        notifyObservers();
    }

    private double Price;
    List<IObserver> observers;

    public Share(String CompanyName, double Price) {
        this.CompanyName = CompanyName;
        this.Price = Price;
        observers = new ArrayList<IObserver>();
    }


    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
