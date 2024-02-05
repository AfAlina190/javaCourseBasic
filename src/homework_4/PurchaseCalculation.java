package homework_4;

public class PurchaseCalculation {
        public static void main(String[] args) {

            int priceA = 1000;
            int priceB = 500;

            int discount = 100;

            int totalCostWithDiscount = priceA + priceB - discount;

            System.out.println("Стоимость суммы A+B со скидкой: " + totalCostWithDiscount + " руб");
            System.out.println("Сумма скидки: " + discount + " руб");
        }
    }
//Задача 3. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб. Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку. Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.

