package homework.homework_41.task_3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//Задача 3: Преобразование списка объектов и агрегация
//
//Задание: Дан список объектов заказов (Order), где каждый заказ
//содержит список покупок (List<Purchase>) и дату заказа.
//Каждая покупка содержит название товара и его стоимость.
//Необходимо рассчитать общую сумму стоимости всех покупок,
//сделанных в текущем месяце.
public class OrderTotalCost {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(LocalDate.of(2021, Month.JANUARY, 15), new ArrayList<>()));
        orders.add(new Order(LocalDate.of(2021, Month.FEBRUARY, 10), new ArrayList<>()));
        orders.add(new Order(LocalDate.of(2021, Month.MARCH, 5), new ArrayList<>()));

        double totalCost = calculateTotalCostForCurrentMonth(orders);
        System.out.println("Общая стоимость покупок в текущем месяце: " + totalCost);
    }

    public static double calculateTotalCostForCurrentMonth(List<Order> orders) {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();

        return orders.stream()
                .filter(order -> order.getDate().getMonth() == currentMonth)
                .flatMap(order -> order.getPurchases().stream())
                .mapToDouble(Purchase::getCost)
                .sum();
    }
}



