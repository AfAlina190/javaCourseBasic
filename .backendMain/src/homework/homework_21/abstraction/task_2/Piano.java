package homework.homework_21.abstraction.task_2;

// Класс пианино
class Piano extends MusicalInstrument {
    // Реализация метода воспроизведения ноты для пианино
    @Override
    public void playNote() {
        System.out.println("Piano sound: ding!");
    }
}