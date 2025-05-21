package practice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProgramFromSir {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6, 0, 4, 2, 5);
        // list.stream().forEach(x -> System.out.print(x));
        // System.out.println();
        // list.stream().distinct().forEach(x -> System.out.print(x));
        // System.out.println();
        // List<Integer> listOfData = list.stream().distinct().toList();
        // System.out.println(listOfData);

        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        // = list.stream().filter(x -> x < 5).toList();

        List<Integer> conditionalList = list.stream().sorted().distinct().toList();
        System.out.println(conditionalList);

    }
}