package homework.homework_40.task_9;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOrdersByMonth {

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, LocalDate.of(2022, Month.JANUARY, 15), 100.0, "Shipped"),
                new Order(2, LocalDate.of(2022, Month.JANUARY, 20), 150.0, "Delivered"),
                new Order(3, LocalDate.of(2022, Month.FEBRUARY, 5), 200.0, "Pending"),
                new Order(4, LocalDate.of(2022, Month.FEBRUARY, 10), 120.0, "Shipped"),
                new Order(5, LocalDate.of(2022, Month.MARCH, 8), 180.0, "Delivered")
        );

        Map<Month, Double> totalAmountByMonth = orders.stream()
                .collect(Collectors.groupingBy(order -> order.date.getMonth(),
                        Collectors.summingDouble(Order::getAmount)));

        System.out.println("Total amount of orders by month: " + totalAmountByMonth);
    }
}
