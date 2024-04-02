package homework.homework_36.Tasks.Generics;

public class Box <T>{
    private T item;

    public void put(T newItem) {
        item = newItem;

    }
    public T get() {
        return item;
    }
    public static void main(String[] args) {
        // Создаем коробку для строк
        Box<String> stringBox = new Box<>();

        // Положим строку "Привет мой свет" в коробку
        stringBox.put("Привет мой свет");

        // Получим строку из коробки и выведем ее
        String greeting = stringBox.get();
        System.out.println(greeting);  // Выведет: Привет мой свет
    }

}