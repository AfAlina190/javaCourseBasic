package homework.homework_38.task_6;

import java.util.ArrayList;
import java.util.List;

public class MergeListApp {
    public static void main(String[] args) {


        ListFunctionalInterface<String> combineLists = (list1,list2) ->
        { List<String> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        };

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Груша");
        stringList1.add("Слива");
        stringList1.add("Яблоко");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Шоколад");
        stringList2.add("Булочка");
        stringList2.add("Торт");

        List<String> resultMergedList = combineLists.mergeTwoLists(stringList1,stringList2);
        System.out.println(resultMergedList);


        ListFunctionalInterface<Integer> combineListInt = (list1,list2) ->
        { List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        };

        List<Integer> intList1 = new ArrayList<>();
        intList1.add(10);
        intList1.add(40);
        intList1.add(60);

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(400);
        intList2.add(600);
        intList2.add(800);

        List<Integer> resultMergedIntList = combineListInt.mergeTwoLists(intList1,intList2);
        System.out.println(resultMergedIntList);
    }
}