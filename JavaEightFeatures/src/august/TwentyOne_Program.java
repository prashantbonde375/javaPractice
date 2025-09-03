package august;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwentyOne_Program {
    public static void main(String[] args) {
        //given string[] array, group the string based on the middle character

        String[] str = {"eewee", "gjjiy", "jhj", "kwkt", "aha"};

        System.out.println(Stream.of(str).collect(Collectors.groupingBy(x -> x.substring(1, 2))));
        //output :- {w=[ewe,kwk], h=[jhj,aha], j=[jji]}

        System.out.println(Stream.of(str).collect(Collectors.groupingBy(x -> x.substring(1, 2))));
    }
}
