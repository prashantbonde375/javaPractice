package august;

import java.util.Arrays;

public class Six_Program {
    public static void main(String[] args) {
        // given sentence, find the word with specific number of vowels
        // if any word containing 2 vowel that should print from given sentence

        String str = "I am prashant ii aam prashant";

        Arrays.stream(str.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}
