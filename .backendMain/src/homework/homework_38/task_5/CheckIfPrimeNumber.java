package homework.homework_38.task_5;

import java.util.function.Predicate;

public class CheckIfPrimeNumber {
    public static void main(String[] args) {

        FICheck<Boolean,Integer> checkIfPrimeNumber = (num) ->
        {  if (num < 2 ) {
            return false;
        }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0 ) {
                    return false;
                }
            }
            return true;
        };

        int numberToCheck = 19;
        if (checkIfPrimeNumber.check(numberToCheck)) {
            System.out.println(numberToCheck + " is prime");
        }else {
            System.out.println(numberToCheck + " is not prime");
        }


        Predicate<Integer> checkIfPrimeNumberPredicate = (num) ->
        {  if (num < 2 ) {
            return false;
        }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0 ) {
                    return false;
                }
            }
            return true;
        };

        int numberToCheckForPredicate = 19;
        if (checkIfPrimeNumberPredicate.test(numberToCheck)) {
            System.out.println(numberToCheckForPredicate + " is prime");
        }else {
            System.out.println(numberToCheckForPredicate + " is not prime");
        }
    }
}
