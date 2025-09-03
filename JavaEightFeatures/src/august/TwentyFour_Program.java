package august;

import java.util.List;
import java.util.stream.Stream;

public class TwentyFour_Program {
    public static void main(String[] args) {
        //convert list of integer in list of their square

        List<Integer> listOfInteger = List.of(2, 3, 4, 5, 6);
        List<Integer> listOfSquare = Stream.of(2, 3, 4, 5, 6).map(x -> x * x).toList();
        System.out.println(listOfSquare);
    }
}
