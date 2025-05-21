package practice;

import java.util.Arrays;

public class Program_10 {
    public static void main(String[] args) {
        // Given an array, find the sum of unique elements

        int[] a = { 9, 8, 7, 5, 4, 3, 2, 1, 1, 2, 3, 7, 8, 9 };

        int array = Arrays.stream(a).distinct().sum();

        System.out.println(array);
    }

}
