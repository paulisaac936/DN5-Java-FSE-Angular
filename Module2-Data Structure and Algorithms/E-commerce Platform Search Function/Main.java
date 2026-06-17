public class Main {

    public static int linearSearch(Product[] products,
                                   String target) {

        for(int i=0;i<products.length;i++) {

            if(products[i].productName.equals(target))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Mouse","Electronics"),
            new Product(3,"Keyboard","Electronics")
        };

        int index =
            linearSearch(products,"Keyboard");

        System.out.println(index);
    }
}