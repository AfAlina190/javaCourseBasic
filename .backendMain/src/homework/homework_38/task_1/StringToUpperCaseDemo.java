package homework.homework_38.task_1;

public class StringToUpperCaseDemo {
    public static void main(String[] args) {

        StringFI<String> convert = (s -> { return s.toUpperCase();} );

        String string1 = "banaNa";
        String string1ToUpperCaseConverted = convert.convertStringToUpperCase(string1);
        System.out.println(string1ToUpperCaseConverted);
    }
}
