package august;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TwentyTwo_Program {
    public static void main(String[] args) {
        //given list, get sum of element from list
        List<Integer> listOfInteger = List.of(1, 2, 3, 4, 5);

        int ans = listOfInteger.stream().mapToInt(Integer::intValue).sum();
//        int ans = Stream.of(1, 2, 3, 4, 5).mapToInt(Integer::intValue).sum();
        //Integer :: intValue --------> x->x
        System.out.println(ans);
    }
}
