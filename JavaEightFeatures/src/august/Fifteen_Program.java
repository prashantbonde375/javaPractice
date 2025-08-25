package august;

import java.util.Arrays;
import java.util.List;

public class Fifteen_Program {
    public static void main(String[] args) {
        // given integer array, find multiplication of first two element

        int[] arr = { 6, 5, 3, 4, 5, 6, 7, 8 };

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int ans = list.stream().limit(2).reduce(1, (a, b) -> a * b);
        System.out.println(ans);
    }
}
