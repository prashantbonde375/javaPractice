package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program_8 {
    public static void main(String[] args) {
        // given a word find the occurance of each character

        String str = "PrashantPrashant";

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Function.identity() and x->x is same
        System.out.println(map);
    }
}
