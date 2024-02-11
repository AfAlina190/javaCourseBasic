package homework_19;

//1. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//   Не используйте дополнительный массив для хранения результатов.
public class Task_1 {
        public static void main(String[] args){

            String[] array = { "Houston ", " we ", " have ", " a ", " problem ", " Apollo ", " 13 "};

            System.out.println("Наша изначальная фраза: ");

            for (int i=0; i<array.length; i++){
                System.out.print(array[i]);
            }
            System.out.println();

            int n = array.length;

            String temp;
            for (int i = 0; i < n/2; i++) {
                temp = array[n-i-1];
                array[n-i-1] = array[i];
                array[i] = temp;
            }
            System.out.println();
            System.out.println("Наша фраза после обмена местами: ");

            for (int i=0; i<array.length; i++){
                System.out.print(array[i]);
            }
        }
    }

