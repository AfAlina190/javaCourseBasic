package homeworkLesson9;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // Генерируем случайное число от 0 до 12
        Random random = new Random();
        int mathScore = random.nextInt(13);

        // Устанавливаем оставшееся время на сегодня
        int remainingTime = 45;

        // Используем оператор switch для оценки и выполнения соответствующего действия
        switch (mathScore) {
            case 10:
            case 11:
            case 12:
                System.out.println("Вы рады за своего ребенка! Осталось времени: " + (remainingTime + 60) + " минут");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Слова похвалы! Осталось времени: " + (remainingTime + 45) + " минут");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Нейтральные слова. Осталось времени: " + (remainingTime + 15) + " минут");
                break;
            case 3:
                System.out.println("Огорчились. Осталось времени: " + (remainingTime - 30) + " минут");
                break;
            default:
                System.out.println("Трагедия! Сегодня ТВ смотреть запрещено.");
        }
    }
}

