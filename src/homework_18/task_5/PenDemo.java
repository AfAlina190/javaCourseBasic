package homework_18.task_5;

public class PenDemo {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Blue");
        Pen pen2 = new Pen("Red");
        Pen pen3 = new Pen("Black");


        Pen[] pensArray = {pen1, pen2, pen3};

        pensArray[0].setColor("Green");
        pensArray[1].setColor("Red");
        pensArray[2].setColor("Black");

        for (Pen pen : pensArray) {
            System.out.println("Pen color: " + pen.getColor());
        }
    }
}