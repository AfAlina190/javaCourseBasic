package homework.homework_21.abstraction.task_1;

// Класс клавиатуры
class Keyboard extends InputDevice {
    // Конструктор
    public Keyboard(String brand) {
        super(brand);
    }

    // Реализация метода подключения
    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }

    // Реализация метода отключения
    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected");
    }
}