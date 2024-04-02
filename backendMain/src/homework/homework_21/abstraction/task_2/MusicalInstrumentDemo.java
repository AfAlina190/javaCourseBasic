package homework.homework_21.abstraction.task_2;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        // Пример использования абстрактных классов и наследования
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        guitar.playNote();
        piano.playNote();
        violin.playNote();
    }
}
