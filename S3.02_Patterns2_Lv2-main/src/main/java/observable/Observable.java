package observable;

import event.StockEvent;
import observer.StockObserver;

public interface Observable {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(StockEvent event);
}
