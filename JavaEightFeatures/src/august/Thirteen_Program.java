package august;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Thirteen_Program {
    public static void main(String[] args) {
        // given integer, find renge of integer

        int[] arr = { 10, 1, 45, 23, 87, 45, 12, 37, 90, 46, 31, 61, 27, 75 };

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        Map<Integer, List<Integer>> ans = list.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));

        System.out.println(ans);

    }
}
