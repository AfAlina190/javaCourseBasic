package homework.homework_34;



public class MyCollection {
    int[] myArray;

    public MyCollection() {
        this.myArray = new int[10];
    }

    public int[] getMyArray() {
        return myArray;
    }
    public void display() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void add(int element) {
                myArray[0] = element;
        }

    }

