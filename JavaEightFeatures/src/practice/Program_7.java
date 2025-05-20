package practice;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program_7 {
    public static void main(String[] args) {
        // divide given integer list into
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<List<Integer>> checkList = list.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println(checkList);
    }
}
