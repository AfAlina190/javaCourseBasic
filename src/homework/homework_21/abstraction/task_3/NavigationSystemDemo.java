package homework.homework_21.abstraction.task_3;

public class NavigationSystemDemo {
    public static void main(String[] args) {
        // Пример использования абстрактных классов и наследования
        CarNavigationSystem carNavigation = new CarNavigationSystem();
        MarineNavigationSystem marineNavigation = new MarineNavigationSystem();

        carNavigation.startNavigation();
        carNavigation.stopNavigation();

        marineNavigation.startNavigation();
        marineNavigation.stopNavigation();
    }
}
