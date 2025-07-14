package observer;

import event.StockEvent;

public class StockAgency implements StockObserver{
    private final String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(StockEvent event) {
        System.out.println(name + " received event: " + event);
    }
}
