package homework_19;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//   Выведите массивы на экран в двух отдельных строках
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

import java.util.Arrays;
import java.util.Random;
public class Task_4 {

//        public static void main(String[] args){
//
//            double sumMas1=0,sumMas2=0;
//
//            int[] Mas1 = new int[5];
//            for(int i=0;i<Mas1.length;i++){
//                Mas1[i]=(int)(Math.random()*6);
//                System.out.print(Mas1[i] +" ");
//
//                sumMas1+=(double)Mas1[i]/Mas1.length;
//            }
//            System.out.println(" ");
//
//            int[] Mas2=new int[5];
//            for(int i=0;i<Mas2.length;i++){
//                Mas2[i] =(int)(Math.random()*6);
//                System.out.print(Mas2[i] +" ");
//                sumMas2+=(double)Mas2[i]/Mas2.length;
//            }
//            System.out.println(" ");
//
//            if(sumMas1==sumMas2)System.out.println("Средние арифметические значения двух массивов равны");
//            else {if(sumMas1>sumMas2)
//                System.out.println("Среднее арифметическое значение первого массива больше и равно ");
//            else System.out.println("Среднее арифметическое значение второго массива больше и равно ");
//            }
//        }


    public class AverageComparison {
        public static void main(String[] args) {
            int[] array1 = generateRandomArray(5);
            int[] array2 = generateRandomArray(5);

            System.out.println("Массив 1: " + Arrays.toString(array1));
            System.out.println("Массив 2: " + Arrays.toString(array2));

            double average1 = calculateAverage(array1);
            double average2 = calculateAverage(array2);

            System.out.println("Среднее арифметическое для массива 1: " + average1);
            System.out.println("Среднее арифметическое для массива 2: " + average2);

            if (average1 > average2) {
                System.out.println("Среднее арифметическое для массива 1 больше.");
            } else if (average1 < average2) {
                System.out.println("Среднее арифметическое для массива 2 больше.");
            } else {
                System.out.println("Средние арифметические для обоих массивов равны.");
            }
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(6); // Случайное число от 0 до 5
            }

            return array;
        }

        public static double calculateAverage(int[] arr) {
            int sum = 0;

            for (int element : arr) {
                sum += element;
            }

            return (double) sum / arr.length;
        }
    }

}

