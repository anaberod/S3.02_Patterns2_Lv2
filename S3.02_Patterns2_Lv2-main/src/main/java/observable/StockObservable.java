package observable;

import event.StockEvent;
import observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements  Observable{

    private final List<StockObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(StockEvent event) {
        for (StockObserver observer : observers) {
            observer.update(event);
        }
    }

    public void marketGoesUp() {
        notifyObservers(new StockEvent(
                "MARKET_UP",
                "Market rises due to strong earnings.",
                "IBEX35",
                1.25
        ));
    }

    public void marketGoesDown() {
        notifyObservers(new StockEvent(
                "MARKET_DOWN",
                "Market falls after political unrest.",
                "NASDAQ",
                -2.1
        ));
    }

    public void marketClosed() {
        notifyObservers(new StockEvent(
                "MARKET_CLOSED",
                "The stock market is now closed.",
                "DAX",
                0.0
        ));
    }
}
