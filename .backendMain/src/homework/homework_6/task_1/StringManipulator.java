package homework.homework_6.task_1;

// StringManipulator.java
public class StringManipulator {
    public char getLastChar(String inputString) {
        return inputString.charAt(inputString.length() - 1);
    }

    public boolean containsSubstring(String inputString, String substring) {
        return inputString.contains(substring);
    }

    public String replaceCharacters(String inputString, char oldChar, char newChar) {
        return inputString.replace(oldChar, newChar);
    }

    public String toUpperCase(String inputString) {
        return inputString.toUpperCase();
    }

    public String toLowerCase(String inputString) {
        return inputString.toLowerCase();
    }

    public String extractSubstring(String inputString, String substring) {
        int index = inputString.indexOf(substring);
        if (index != -1) {
            return inputString.substring(index, index + substring.length());
        } else {
            return null;
        }
    }
}
