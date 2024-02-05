package lesson_15;
import java.util.ArrayList;
public class HighLevelDemo {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "Whiskey";
        names[1] = "Single";
        DataLowLevel dataLowLevel = new DataLowLevel(names);
        DataMiddleLevel dataMiddleLevel = new DataMiddleLevel("White Horse", dataLowLevel);
        DataHighLevel dataHighLevel = new DataHighLevel(1, dataMiddleLevel);

        System.out.println("Данные на уровне dataMiddleLevel в dataHighLevel");
        System.out.println(dataHighLevel.idHiLevel);

        System.out.println("Данные из поля dataMiddleLevel в dataHighLevel");
        System.out.println(dataHighLevel.dataMiddleLevel.label);

        System.out.println("Даные из поля dataLowLevel в dataMiddleLevel в dataHighLevel");
        System.out.println(dataHighLevel.dataMiddleLevel.dataLowLevel.name);



    }

}
