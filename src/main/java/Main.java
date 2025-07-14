import observable.StockObservable;
import observer.StockAgency;
import observer.StockObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockMarket = new StockObservable();

        StockObserver agencyA = new StockAgency("Agency A");
        StockObserver agencyB = new StockAgency("Agency B");

        stockMarket.addObserver(agencyA);
        stockMarket.addObserver(agencyB);

        stockMarket.marketGoesUp();
        stockMarket.marketGoesDown();
        stockMarket.marketClosed();
    }
}
