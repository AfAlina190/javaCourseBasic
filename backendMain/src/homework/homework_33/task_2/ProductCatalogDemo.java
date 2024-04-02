package homework.homework_33.task_2;

public class ProductCatalogDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product apple = new Product("Apple", 10.0);
        Product banana = new Product("Banana", 8.5);
        Product orange = new Product("Orange", 12.2);

        catalog.addProduct(1, apple);
        catalog.addProduct(2, banana);
        catalog.addProduct(3, orange);

        catalog.findProduct(2);

        catalog.deleteProduct(2);

        catalog.findProduct(2);
    }
}