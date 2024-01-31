package lessons.lesson_12;

public class DeviceCheck {
    double temperature1;
    double temperature2;

    boolean work = true;

    public void temperatures() {
        if (temperature1 > 100) {
            if (temperature2 < 100) {
                work = true;
            } else work = false;
        }
    }
}