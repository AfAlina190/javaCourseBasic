package homework.homework_30.task_2.var_1;

import java.util.*;

class Suitcase {
    private String material;
    private String size;
    private String color;

    public Suitcase(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class SuitcaseComparator implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        // Сначала сравниваем по размеру
        int sizeComparison = suitcase1.getSize().compareTo(suitcase2.getSize());

        // Если размер одинаковый, сравниваем по материалу
        if (sizeComparison == 0) {
            int materialComparison = suitcase1.getMaterial().compareTo(suitcase2.getMaterial());

            // Если материал одинаковый, сравниваем по цвету
            if (materialComparison == 0) {
                return suitcase1.getColor().compareTo(suitcase2.getColor());
            }

            return materialComparison;
        }

        return sizeComparison;
    }
}

public class SuitcaseCollectionsExample {
    public static void main(String[] args) {
        // Создаем TreeSet с использованием нашего компаратора
        TreeSet<Suitcase> suitcaseTreeSet = new TreeSet<>(new SuitcaseComparator());

        // Создаем LinkedList для сравнения
        List<Suitcase> suitcaseLinkedList = new LinkedList<>();

        // Добавляем несколько элементов
        suitcaseTreeSet.add(new Suitcase("Ткань", "M", "Синий"));
        suitcaseTreeSet.add(new Suitcase("Пластик", "L", "Красный"));
        suitcaseTreeSet.add(new Suitcase("Ткань", "XL", "Зеленый"));

        suitcaseLinkedList.add(new Suitcase("Ткань", "M", "Синий"));
        suitcaseLinkedList.add(new Suitcase("Пластик", "L", "Красный"));
        suitcaseLinkedList.add(new Suitcase("Ткань", "XL", "Зеленый"));

        // Печатаем отсортированный TreeSet
        System.out.println("TreeSet:");
        for (Suitcase suitcase : suitcaseTreeSet) {
            System.out.println(suitcase);
        }

        // Печатаем отсортированный LinkedList
        System.out.println("\nLinkedList:");
        Collections.sort(suitcaseLinkedList, new SuitcaseComparator());
        for (Suitcase suitcase : suitcaseLinkedList) {
            System.out.println(suitcase);
        }
    }
}
