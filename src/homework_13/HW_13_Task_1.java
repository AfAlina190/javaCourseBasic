package homework_13;

public class HW_13_Task_1 {

    public static void main(String[] args) {

        int[] intArray = new int[8];
        // with random Number
        for (int i = 0; i < intArray.length; i++) {
            int randomNum = (int)(Math.random() * 50);  // 1 to 50
            intArray[i] = randomNum;
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();

        //with Odd = 0
        for (int i = 0; i < intArray.length; i++) {
            int randomNum = (int)(Math.random() * 50);  // 1 to 50
            if (i % 2 == 0){
                intArray[i] = randomNum;
            }else {
                intArray[i] = 0;
            }
        }


        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }


    }
}
