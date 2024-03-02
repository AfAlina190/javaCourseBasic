package homework.homework_33.task_2;

import java.util.HashMap;
import java.util.Map;

class ProductCatalog {
    private Map<Integer, Product> catalog;

    public ProductCatalog() {
        this.catalog = new HashMap<>();
    }

    public void addProduct(int productId, Product product) {
        if (!catalog.containsKey(productId)) {
            catalog.put(productId, product);
            System.out.println("Product added to the catalog: " + product);
        } else {
            System.out.println("Product with ID " + productId + " already exists in the catalog.");
        }
    }

    public void deleteProduct(int productId) {
        if (catalog.containsKey(productId)) {
            Product deletedProduct = catalog.remove(productId);
            System.out.println("Product deleted from the catalog: " + deletedProduct);
        } else {
            System.out.println("Product with ID " + productId + " not found in the catalog.");
        }
    }

    public Product findProduct(int productId) {
        Product product = catalog.get(productId);
        if (product != null) {
            System.out.println("Found product in the catalog: " + product);
        } else {
            System.out.println("Product with ID " + productId + " not found in the catalog.");
        }
        return product;
    }
}
