import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string:---");
        // String str = sc.nextLine();
        // String str = "prashant";

        // Map<Character, Long> charCountMap = str.chars().mapToObj(c -> (char) c)
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // charCountMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:---");
        String str = "PRashassssnt";
        sc.close(); // Close the scanner to prevent resource leaks

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count occurrences
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the occurrences of each character
        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
