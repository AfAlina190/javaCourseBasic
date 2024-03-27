package homework.homework_40.task_7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragePriceByCategory_1 {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0, 10),
                new Product("Smartphone", "Electronics", 800.0, 15),
                new Product("Dress", "Clothing", 50.0, 30),
                new Product("Shoes", "Clothing", 80.0, 20),
                new Product("Book", "Books", 15.0, 50)
        );

        int minQuantity = 20;

        Map<String, Double> averagePricesByCategory = products.stream()
                .filter(product -> product.quantity > minQuantity)
                .collect(Collectors.groupingBy(
                        product -> product.category,
                        Collectors.averagingDouble(product -> product.price)
                ));

        averagePricesByCategory.entrySet().stream()
                .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> {
                    System.out.println("Category: " + entry.getKey() + ", Average Price: " + entry.getValue());
                });
    }
}