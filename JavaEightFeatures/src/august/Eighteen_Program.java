package august;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Eighteen_Program {
    public static void main(String[] args) {
        //multiply first with last element , second with second last element, third with last third element

        int[] a = {4, 5, 2, 3, 3, 4};

        IntStream.range(0, a.length).filter(x -> x % 2 == 0).map(x -> a[x] * a[a.length - x - 1]).forEach(System.out::println);

        List<Integer> list = IntStream.range(0, a.length).filter(x -> x % 2 == 0).map(x -> a[x] * a[a.length - x - 1]).boxed().toList();
        System.out.println(list);
    }
}
