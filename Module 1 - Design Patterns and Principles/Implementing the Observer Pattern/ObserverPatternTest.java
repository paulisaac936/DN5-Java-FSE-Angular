public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Praveen");
        Observer webUser = new WebApp("Kumar");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update stock prices
        stockMarket.setStockPrice("TCS", 3850.50);
        stockMarket.setStockPrice("Infosys", 1725.75);

        // Remove one observer
        stockMarket.removeObserver(webUser);

        System.out.println("\nWeb User Unsubscribed");

        // Update again
        stockMarket.setStockPrice("Wipro", 295.40);
    }
}