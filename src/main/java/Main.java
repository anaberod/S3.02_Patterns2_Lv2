public class Main {
    public static void main(String[] args) {
        StockObservable observable = new StockObservable();
        StockObserver agency1 = new StockAgency("Agency A");
        StockObserver agency2 = new StockAgency("Agency B");

        observable.addObserver(agency1);
        observable.addObserver(agency2);

        observable.setMarketIsUp(true);
        observable.setMarketIsUp(false);

    }
}
