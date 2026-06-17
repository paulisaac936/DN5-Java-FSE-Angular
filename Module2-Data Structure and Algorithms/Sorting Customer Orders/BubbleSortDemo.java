public class BubbleSortDemo {

    static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(orders[j].totalPrice >
                   orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(1,"John",5000),
            new Order(2,"Alice",2000),
            new Order(3,"Bob",8000)
        };

        bubbleSort(orders);

        for(Order o : orders)
            o.display();
    }
}