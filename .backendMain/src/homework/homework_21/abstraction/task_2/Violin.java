package homework.homework_21.abstraction.task_2;

// Класс скрипки
class Violin extends MusicalInstrument {
    // Реализация метода воспроизведения ноты для скрипки
    @Override
    public void playNote() {
        System.out.println("Violin sound: screech!");
    }
}