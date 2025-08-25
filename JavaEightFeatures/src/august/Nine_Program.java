package august;

import java.util.Arrays;
import java.util.Collections;

public class Nine_Program {
    public static void main(String[] args) {

        // given int array, re-arrange the element lowest/highest possible value

        int[] arr = { 3, 5, 2, 1, 8, 6, 7 };

        // lowest to highest
        Arrays.stream(arr).mapToObj(x -> x).sorted().forEach(System.out::print);
        System.out.println(" ");

        // highest to lowest
        Arrays.stream(arr).mapToObj(x -> x).sorted(Collections.reverseOrder()).forEach(System.out::print);

    }
}
