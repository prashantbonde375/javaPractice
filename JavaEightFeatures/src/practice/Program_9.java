package practice;

import java.util.Arrays;
import java.util.Collections;

public class Program_9 {
    public static void main(String[] args) {
        int[] a = { 1, 7, 5, 2, 3, 6, 4 };
        // Arrange the numbers in Descending/Ascending Order

        // Ascending order

        Arrays.stream(a).mapToObj(x -> x).sorted().forEach(System.out::print);
        System.out.println();
        Arrays.stream(a).mapToObj(x -> x).sorted(Collections.reverseOrder()).forEach(System.out::print);
    }
}
