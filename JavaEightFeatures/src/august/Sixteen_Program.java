package august;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Sixteen_Program {
    public static void main(String[] args) {
        // group / pair anagram from a list of string, for 1 word consider only one
        // anagram

        String[] str = {"listen", "ate", "pat", "tap", "pan", "nap", "silent", "team", "tree", "eat"};
        System.out.println(str); // output is [Ljava.lang.String;@7344699f

        System.out.println(Arrays.toString(str)); // will print array of string

        Collection<List<String>> answer = Arrays.stream(str).collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().toList())).values();
        System.out.println(answer);
    }
}
