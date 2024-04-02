package lessons.lesson_5.furniture;

public class FurnitureExample {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Table");

        furniture1.material = "wood";
        furniture1.color = "white";

        Furniture furniture2 = new Furniture("Table № 2 ",  "Glass and metal");

        furniture2.color = "silver";
        System.out.println(furniture1);
        System.out.println(furniture2);
    }
}
