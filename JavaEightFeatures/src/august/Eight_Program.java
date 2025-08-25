package august;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Eight_Program {
    public static void main(String[] args) {

        // given word find occurrence of each characters
        String str = "prashant";

        Map<String, Long> map = Arrays.stream(str.split("")).map(x->x.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
