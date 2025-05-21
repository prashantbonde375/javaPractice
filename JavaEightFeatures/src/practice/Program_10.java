package practice;

import java.util.Arrays;

public class Program_10 {
    public static void main(String[] args) {
        // Given an array, find the sum of unique elements

        int[] a = { 9,8,7,6,5,4,3,2,1,1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Arrays.stream(a).distinct();
    }

}
