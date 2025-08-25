package august;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Twelve_Program {
    public static void main(String[] args) {
        // given string, find first repeated character.

        String str = "Hello World";

        Map<Character, Long> charMap = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(charMap);

        char ans = charMap.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get();
        System.out.println("first repeated character is : " + ans);
    }
}
