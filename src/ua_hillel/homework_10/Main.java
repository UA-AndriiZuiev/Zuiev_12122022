package ua_hillel.homework_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        System.out.println("Вхідні дані - " + fruits + "\n");

/**=======================================================================================*/
/**        1) Підрахуйте кількість фруктів, ім'я яких починається на "a"
 */
        int result = 0;

        List<Integer> newList = fruits.stream().map(element ->
                {
                    if (element.charAt(0) == 'a') return 1;
                    return 0;
                }
        ).collect(Collectors.toList());

        for (int i : newList) {
            result += i;
        }
        System.out.println("Кількість фруктів назва яких починаєтья на 'a' - " + result);

/**=======================================================================================*/
/**        2) Виведить на екран фрукти, довжина ім'я яких >4
 */
        System.out.println("\nФрукти, довжина назви яких більше 4 : ");
        fruits.stream().map(element -> {
                    if (element.length() > 4) System.out.println(element);
                    return null;
                }
        ).collect(Collectors.toList());

/**=======================================================================================*/
/**        3) Виведить на екран суму літер перших 3 фруктів
 */
        int summ = 0;
        List<Integer> arraylist = fruits.stream().map(element -> element.length()).collect(Collectors.toList());

        for (int i = 0; i < 3; i++) {
            summ += arraylist.get(i);
        }
        System.out.println("\nСума довжин назв перших трьох фруктів = " + summ);
    }
}