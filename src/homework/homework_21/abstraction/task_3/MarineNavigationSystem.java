package homework.homework_21.abstraction.task_3;

// Класс системы навигации в море
class MarineNavigationSystem extends NavigationSystem {
    // Реализация метода для старта навигации в море
    @Override
    public void startNavigation() {
        System.out.println("Marine Navigation System started.");
    }

    // Реализация метода для завершения навигации в море
    @Override
    public void stopNavigation() {
        System.out.println("Marine Navigation System stopped.");
    }
}
