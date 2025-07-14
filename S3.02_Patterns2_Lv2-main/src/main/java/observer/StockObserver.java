package observer;

import event.StockEvent;

public interface StockObserver {
    void update(StockEvent event);
}
