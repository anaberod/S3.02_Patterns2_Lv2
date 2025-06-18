import java.util.ArrayList;
import java.util.List;

public class StockObservable {
    private List<StockObserver> observers = new ArrayList<>();
    private boolean marketIsUp;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver (StockObserver observer) {
        observers.remove(observer);
    }

    public void setMarketIsUp (boolean state) {
        this.marketIsUp = state;
        notifyObservers();

    }

    private void notifyObservers() {
        String message = marketIsUp ? "The market is up" : "The market is down";
        for (StockObserver observer : observers) {
            observer.update(message);
        }
    }
}
