package homework.homework_30.task_1;

import java.util.*;

class Flat {
    private double area;
    private int bedrooms;

    public Flat(double area, int bedrooms) {
        this.area = area;
        this.bedrooms = bedrooms;
    }

    public double getArea() {
        return area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", bedrooms=" + bedrooms +
                '}';
    }
}

class FlatComparator implements Comparator<Flat> {
    @Override
    public int compare(Flat flat1, Flat flat2) {
        // Сначала сравниваем по количеству комнат
        int bedroomsComparison = Integer.compare(flat1.getBedrooms(), flat2.getBedrooms());

        // Если количество комнат одинаково, сравниваем по площади
        if (bedroomsComparison == 0) {
            return Double.compare(flat1.getArea(), flat2.getArea());
        }

        return bedroomsComparison;
    }
}
