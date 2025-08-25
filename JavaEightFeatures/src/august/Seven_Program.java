package august;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seven_Program {
    public static void main(String[] args) {

        // given Array of integer, separate it even and odd number
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        List<Integer> list = Arrays.stream(a).boxed().toList();

        List<List<Integer>> ans = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 1, Collectors.toList()))
                .entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println(ans);
    }
}
