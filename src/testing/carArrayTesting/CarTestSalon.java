package testing.carArrayTesting;

public class CarTestSalon {
    public static void main(String[] args) {

        CarTestingDemo carTestingDemo1 = new CarTestingDemo(576, "Volkswagen Golf", "White", "Hatchback", 2020, 18000.0);
        CarTestingDemo carTestingDemo2 = new CarTestingDemo(122, "Toyota Camry", "Silver", "Sedan", 2022, 25000.0);
        CarTestingDemo carTestingDemo3 = new CarTestingDemo(342, "Honda Civic", "Blue", "Sedan", 2021, 22000.0);
        CarTestingDemo carTestingDemo4 = new CarTestingDemo(374, "Ford Mustang", "Red", "Coupe", 2023, 40000.0);
        CarTestingDemo carTestingDemo5 = new CarTestingDemo(433, "Chevrolet Tahoe", "Black", "SUV", 2022, 55000.0);


        CarTestingDemo[] carTestingDemo = {carTestingDemo1, carTestingDemo2,carTestingDemo3, carTestingDemo4, carTestingDemo5};

        for (int i = 0; i < carTestingDemo.length; i++) {
            System.out.println("Номер каталога: " + carTestingDemo[i].getId());
            System.out.println("Модель: " + carTestingDemo[i].getModel());
            System.out.println("Цвет: " + carTestingDemo[i].getColor());
            System.out.println("Тип: " + carTestingDemo[i].getType());
            System.out.println("Год производства " + carTestingDemo[i].getYear());
            System.out.println("Цена: " + carTestingDemo[i].getPrice());
            System.out.println("------------------------------");
        }
        // Задача - посчитать количество машин черного цвета?
        int blackCarCounter = 0;

        String typeOfColorCar = "Black";

        for (int i = 0; i < carTestingDemo.length; i++) {
            if (carTestingDemo[i].getColor().equals(typeOfColorCar)) {
                blackCarCounter++;
            }
        }

        if (blackCarCounter > 0) {
            System.out.println("На складе " + blackCarCounter + " машин черного цвета: " + typeOfColorCar);
        } else {
            System.out.println("Таких машин на складе нет");
        }
    }
    }


