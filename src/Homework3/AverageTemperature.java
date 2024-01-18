package Homework3;

public class AverageTemperature {
        public static void main(String[] args) {

            int[] temperatures = {10, 5, 11, 5, 9, 6, 8, 4, 8, 2, 5, 2, 6, 3};

            int sum = 0;
            for (int temperature : temperatures) {
                sum += temperature;
            }
            double averageTemperature = (double) sum / temperatures.length;

            System.out.println("Средняя температура за неделю: " + averageTemperature + " градусов Цельсия");
        }
    }


