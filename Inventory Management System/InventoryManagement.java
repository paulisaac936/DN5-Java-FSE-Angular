import java.util.HashMap;

public class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product Added");
    }

    // Update Product Quantity
    public void updateProduct(int productId, int newQuantity) {
        if (inventory.containsKey(productId)) {
            inventory.get(productId).quantity = newQuantity;
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product Deleted");
        } else {
            System.out.println("Product Not Found");
        }
    }

    // Display Products
    public void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        InventoryManagement ims = new InventoryManagement();

        ims.addProduct(new Product(101, "Laptop", 10, 50000));
        ims.addProduct(new Product(102, "Mouse", 50, 500));

        ims.displayProducts();

        ims.updateProduct(101, 15);

        ims.deleteProduct(102);

        System.out.println("\nAfter Update/Delete:");

        ims.displayProducts();
    }
}