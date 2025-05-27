package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Program_16 {
    public static void main(String[] args) {
        // pair anagram from list of string
        String[] str = { "nap", "apn", "tap", "pat" };
        List<String> list = Arrays.asList(str);
        Collection<List<String>> mapOfList = list.stream()
                .collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().toList()))
                .values();

        System.out.println(mapOfList);
    }
}
