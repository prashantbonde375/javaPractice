package practice;

import java.util.Arrays;

public class Program_15 {
    public static void main(String[] args) {

        // product of first two elements

        // eg.. 12*6=72
        int[] array = { 12, 6, 4, 3, 2, 5, 6, 7, 5 };

        int answer = Arrays.stream(array).boxed().toList().stream().limit(2).reduce(1, (a, b) -> a * b);
        System.out.println(answer);
    }
}
