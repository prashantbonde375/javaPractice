package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Program_7 {
    public static void main(String[] args) {
        // divide given integer list into
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        List<Integer> list = Arrays.stream(a).boxed().toList();

        List<List<Integer>> checkList = list.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(Entry::getValue).toList();
                //.map(x->x.getvalue()) we can use also
        System.out.println(checkList);
    }
}
