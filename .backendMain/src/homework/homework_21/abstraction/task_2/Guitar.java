package homework.homework_21.abstraction.task_2;

// Класс гитары
class Guitar extends MusicalInstrument {
    // Реализация метода воспроизведения ноты для гитары
    @Override
    public void playNote() {
        System.out.println("Guitar sound: pling!");
    }
}