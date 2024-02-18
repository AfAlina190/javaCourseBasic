package homework.homework_21.abstraction.task_3;

// Класс системы навигации в автомобиле
class CarNavigationSystem extends NavigationSystem {
    // Реализация метода для старта навигации в автомобиле
    @Override
    public void startNavigation() {
        System.out.println("Car Navigation System started.");
    }

    // Реализация метода для завершения навигации в автомобиле
    @Override
    public void stopNavigation() {
        System.out.println("Car Navigation System stopped.");
    }
}
