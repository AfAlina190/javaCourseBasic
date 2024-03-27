package homework.homework_21.abstraction.task_1;

public class InputDeviceDemo {
    public static void main(String[] args) {
        // Пример использования абстрактных классов и наследования
        Keyboard keyboard = new Keyboard("Logitech");
        Mouse mouse = new Mouse("Microsoft");

        keyboard.printBrand();
        keyboard.connect();
        keyboard.disconnect();

        System.out.println();

        mouse.printBrand();
        mouse.connect();
        mouse.disconnect();
    }
}
