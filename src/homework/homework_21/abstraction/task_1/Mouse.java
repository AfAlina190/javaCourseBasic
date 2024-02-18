package homework.homework_21.abstraction.task_1;

// Класс мыши
class Mouse extends InputDevice {
    // Конструктор
    public Mouse(String brand) {
        super(brand);
    }

    // Реализация метода подключения
    @Override
    public void connect() {
        System.out.println("Mouse connected");
    }

    // Реализация метода отключения
    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
    }
}
