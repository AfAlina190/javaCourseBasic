package lessons.lesson_6.scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String text = ui.inputText("Введите текст: ");

        System.out.println("Вы ввели: " + text);
    }
}

