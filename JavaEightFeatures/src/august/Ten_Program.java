package august;

import java.util.Arrays;

public class Ten_Program {
    public static void main(String[] args) {

        // given int array find sum of unique number.
        int[] arr = { 1, 1, 6, 6, 4, 3, 5, 5, 2 };
        int a = Arrays.stream(arr).distinct().sum();

        System.out.println(a);
    }
}
