package homework_11;

//2. проверить является ли число которое ввел пользователь - простым
//   (делится без остатка только на 1 и на себя)
public class SimpleNumber {
    public boolean isSimple(int checkNumber){

        for (int i = 2; i <= checkNumber / 2; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
