package homework_10;

//Practice Task 1

// Задание 1. У вас есть текст
//Требуется:
//убрать все специальные символы, такие "(", ")", "@"
//(методом replaceAll не пользоваться)
public class DeleteSymbol {

        public static void main(String[] args) {
            String originalText = "Текст с (абра-кадабра) @специальными символами!";
            String resultText = removeSymbol(originalText);

            System.out.println("Исходный текст: " + originalText);
            System.out.println("Текст без специальных символов: " + resultText);
        }

        private static String removeSymbol(String input) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar != '(' && currentChar != ')' && currentChar != '@') {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
    }
