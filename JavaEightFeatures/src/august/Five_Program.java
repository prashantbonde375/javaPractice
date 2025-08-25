package august;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Five_Program {
    public static void main(String[] args) {

        // given sentence find occurrence of word
        String str = "I am Prashant i am prashant";

        Map<String, Long> map = Arrays.stream(str.split(" ")).map(String::toLowerCase )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
