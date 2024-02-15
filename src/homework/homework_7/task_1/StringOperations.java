package homework.homework_7.task_1;

public class StringOperations {
    private String str;

    public StringOperations(String str) {
        this.str = str;
    }

    public void printLastChar() {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }


    public void checkSubstring(String substring) {
        boolean containsSubstring = str.contains(substring);
        System.out.println("Строка содержит подстроку '" + substring + "': " + containsSubstring);
    }


    public void replaceChars(char oldChar, char newChar) {
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("Строка после замены символов '" + oldChar + "' на '" + newChar + "': " + replacedStr);
    }

    public void toUpperCase() {
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseStr);
    }


    public void toLowerCase() {
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseStr);
    }


    public void cutSubstring(String substring) {
        int index = str.indexOf(substring);
        if (index != -1) {
            String cutStr = str.substring(index, index + substring.length());
            System.out.println("Вырезанная подстрока '" + substring + "': " + cutStr);
        } else {
            System.out.println("Подстрока '" + substring + "' не найдена в строке.");
        }
    }
}
