package practice;

import java.util.Arrays;

public class Program_2 {
    public static void main(String[] args) {
        // remove duplicates from string and return in same order

        // String str = "I am prashant and working as a java developer! I am prashant and working as a java developer! I am prashant and working as a java developer!";

        // Arrays.stream(str.split(" ")).distinct().forEach(System.out::println);

        String str1 = "PPrrashhaanntt";

        Arrays.stream(str1.split("")).distinct().forEach(System.out::println);
    }
}
