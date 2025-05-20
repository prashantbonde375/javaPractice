package practice;

import java.util.Arrays;

public class Program_6 {
    public static void main(String[] args) {

        // find the word which specified number of vowels in string
        String str = "i am prashant";

        Arrays.stream(str.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}