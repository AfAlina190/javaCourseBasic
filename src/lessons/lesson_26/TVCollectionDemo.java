package lessons.lesson_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TVCollectionDemo {
    public static void main(String[] args) {
        // Создаем коллекцию для телевизоров
        List<TV> tvCollection = new ArrayList<>();

        // Добавляем три телевизора в коллекцию
        tvCollection.add(new TV("Samsung", 55));
        tvCollection.add(new TV("LG", 50));
        tvCollection.add(new TV("Sony", 65));
        tvCollection.add(new TV("Samsung", 59));
        tvCollection.add(new TV("LG", 25));
        tvCollection.add(new TV("Sony", 75));

        // Распечатываем коллекцию
        System.out.println("TV Collection:");
        for (TV tv : tvCollection) {
            System.out.println(tv);
        }

        // Удаляем телевизор по производителю (удаляем первый телевизор с совпадающим производителем)
        String manufacturerToRemove = "Samsung";
        Iterator<TV> iterator = tvCollection.iterator();
        while (iterator.hasNext()) {
            TV tv = iterator.next();
            if (tv.getManufacturer().equals(manufacturerToRemove)) {
                iterator.remove();
                break; // Удалили первый подходящий и выходим из цикла
            }
        }

        // Распечатываем обновленную коллекцию
        System.out.println("\nTV Collection after removal:");
        for (TV tv : tvCollection) {
            System.out.println(tv);
        }
    }
}
