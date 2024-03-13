package homework.homework_38.task_3;

public class CheckPalindrome {
    public static void main(String[] args) {
        FICheck<Boolean,String> checkPalindrom = (text) ->
        { String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

            int left = 0;
            int right = cleanText.length() - 1;

            while (left < right) {
                if (cleanText.charAt(left) != cleanText.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        };

        Boolean isPalindrome1 = checkPalindrom.check("Madam, in Eden, I'm Adam.");
        Boolean isPalindrome2 = checkPalindrom.check("Hello World!");

        System.out.println("Is Text: ('Madam, in Eden, I'm Adam.') a palindrome? "+isPalindrome1);
        System.out.println("Is Text: ('Hello World!') a palindrome? "+isPalindrome2);
    }
}