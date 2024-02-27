package homework.homework_30.task_1;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Создаем TreeSet с использованием нашего компаратора
        TreeSet<Flat> flatSet = new TreeSet<>(new FlatComparator());

        // Добавляем несколько элементов
        flatSet.add(new Flat(80.5, 2));
        flatSet.add(new Flat(70.0, 3));
        flatSet.add(new Flat(90.0, 2));

        // Печатаем отсортированный набор
        for (Flat flat : flatSet) {
            System.out.println(flat);
        }
    }
}
