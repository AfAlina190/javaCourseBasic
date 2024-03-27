package homework.homework_21.abstraction.task_1;

// Абстрактный класс устройства ввода
abstract class InputDevice {
    private String brand;

    // Конструктор
    public InputDevice(String brand) {
        this.brand = brand;
    }

    // Абстрактный метод для подключения устройства
    public abstract void connect();

    // Абстрактный метод для отключения устройства
    public abstract void disconnect();

    // Общий метод для всех устройств
    public void printBrand() {
        System.out.println("Brand: " + brand);
    }
}






