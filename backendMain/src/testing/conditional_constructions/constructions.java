package testing.conditional_constructions;

public class constructions {
    public static void main(String[] args) {
//        условные конструкции if-else
        int a = 15, b = 14, c = 11, d = 17, e = 19;
        char symbol1 ='A', symbol2 ='B', symbol3 ='C';
        boolean isHasCar = false;

        if (isHasCar || a == b){
            System.out.println("Да, верно: a > b ");
        }
        if (isHasCar == true){
            System.out.println("Нет, не верно: ");
        } else if (isHasCar == false){
            System.out.println("Да, верно: false ");
        }
        else {
            System.out.println("Попробуй еще раз");
        }
    }
}
