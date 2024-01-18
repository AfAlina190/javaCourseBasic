package Homework3;

public class PurchaseCalculation {
        public static void main(String[] args) {
            // Цены на товары A и B
            int priceA = 1000;
            int priceB = 500;

            // Скидка на всю покупку
            int discount = 100;

            // Вычисляем стоимость суммы A+B со скидкой
            int totalCostWithDiscount = priceA + priceB - discount;

            // Выводим результат на экран
            System.out.println("Стоимость суммы A+B со скидкой: " + totalCostWithDiscount + " руб");

            // Выводим сумму скидки на экран
            System.out.println("Сумма скидки: " + discount + " руб");
        }
    }


