package practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program_13 {
    public static void main(String[] args) {
        // input (1,2,12,13,23,25,35,33,44,45,55,56,)
        int[] aa = { 1, 2, 12, 13, 23, 25, 35, 33, 44, 45, 55, 56 };

        // output 10[1,2] 20[12,13] 30[35,33] 40[44,45] 50[55,56]
        List<Integer> list = Arrays.stream(aa).boxed().toList();

        Map<Integer, List<Integer>> listOfMap = list.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));

        System.out.println(listOfMap);
    }
}
