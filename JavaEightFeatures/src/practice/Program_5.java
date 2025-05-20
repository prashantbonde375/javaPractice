package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program_5 {
    public static void main(String[] args) {

        // find the occurance of each word
        String str = "i am prashant java i am java prashant";
        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
