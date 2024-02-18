package homework.homework_21.encapsulation.task_3;

public class SystemConfiguration {
    private int logLevel;
    private String logFilePath;

    public SystemConfiguration(int logLevel, String logFilePath) {
        setLogLevel(logLevel);
        setLogFilePath(logFilePath);
    }

    // Геттеры и сеттеры для logLevel и logFilePath
    public int getLogLevel() {
        return logLevel;
    }

    // Сеттер для изменения уровня логирования с проверкой корректности значения
    public void setLogLevel(int logLevel) {
        if (logLevel >= 1 && logLevel <= 5) {
            this.logLevel = logLevel;
        } else {
            System.out.println("Некорректное значение для уровня логирования.");
        }
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    // Сеттер для изменения пути к файлам логов
    public void setLogFilePath(String logFilePath) {
        if (logFilePath != null && !logFilePath.isEmpty()) {
            this.logFilePath = logFilePath;
        } else {
            System.out.println("Некорректное значение для пути к файлам логов.");
        }
    }

    public static void main(String[] args) {
        // Пример использования
        SystemConfiguration config = new SystemConfiguration(3, "/logs/system_logs.txt");

        System.out.println("Текущий уровень логирования: " + config.getLogLevel());
        config.setLogLevel(4);
        System.out.println("Новый уровень логирования: " + config.getLogLevel());

        System.out.println("Текущий путь к файлам логов: " + config.getLogFilePath());
        config.setLogFilePath("/logs/new_logs.txt");
        System.out.println("Новый путь к файлам логов: " + config.getLogFilePath());
    }
}
