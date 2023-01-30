package ua_hillel.homework_10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        System.out.println("Вхідні дані - " + fruits + "\n");

/**=========================================================================================
 **        1) Підрахуйте кількість фруктів, ім'я яких починається на "a"
 **/
        System.out.println("Кількість фруктів назва яких починаєтья на 'a' - " +
                fruits.stream().filter(element -> element.charAt(0) == 'a').collect(Collectors.toList()).size());

/**==========================================================================================
 **        2) Виведить на екран фрукти, довжина ім'я яких >4
 **/
        System.out.println("\nФрукти, довжина назви яких більше 4 : ");
        fruits.stream().filter(element -> element.length() > 4).forEach(System.out::println);

/**=========================================================================================
 **        3) Виведить на екран суму літер перших 3 фруктів
 **/
        Optional<Integer> result = fruits.stream().limit(3).map(element -> element.length()).reduce((x, y) -> (x + y));
        System.out.println("\nСума довжин назв перших трьох фруктів = " + result.get());
    }
}