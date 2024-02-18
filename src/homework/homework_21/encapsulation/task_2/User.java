package homework.homework_21.encapsulation.task_2;

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Геттеры и сеттеры для login, password и email
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    // Сеттер для изменения пароля с учетом безопасности
    public void changePassword(String oldPassword, String newPassword) {
        // Проверка старого пароля и требований к новому паролю
        if (oldPassword.equals(password) && newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Пароль успешно изменен.");
        } else {
            System.out.println("Некорректные данные для изменения пароля.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        // Пример использования
        User user = new User("john_doe", "password123", "john@example.com");

        System.out.println("Текущий логин: " + user.getLogin());
        user.setLogin("new_john_doe");
        System.out.println("Новый логин: " + user.getLogin());

        System.out.println("Текущий email: " + user.getEmail());
        user.setEmail("new_email@example.com");
        System.out.println("Новый email: " + user.getEmail());

        // Смена пароля с корректными данными
        user.changePassword("password123", "newPassword456");

        // Попытка смены пароля с некорректными данными
        user.changePassword("wrongPassword", "short");
    }
}
