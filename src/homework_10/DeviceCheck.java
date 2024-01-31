package homework_10;


// Practice Task 1

//  Представим, что у нас есть устройство, в котором две колбы.
//    Прибор работает корректно, если температура первой колбы выше 100 градусов,
//    а температура второй колбы меньше 100 градусов.
//
//a.	Вы должны написать метод, который проверяет это устройство.
//b.	Ваша программа должна иметь переменные temperature1 и temperature2.
//c.	В результате метод возвращает true или false.


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