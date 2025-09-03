package august;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwentyThree_Program {
    public static void main(String[] args) {
        //sort a list of string in alphabetical order


        List<String> listOfString = List.of("zara", "dddidas", "h&m", "puma", "fogg", "balentine");

        List<String> answerList = listOfString.stream().sorted().toList();
        System.out.println(answerList);


        List<String> secondList = Stream.of("zara", "addidas", "h&m", "puma", "fogg", "balentine").sorted().toList();
        System.out.println(secondList);

        List<Integer> listOfInteger = Stream.of(6, 4, 3, 4, 3, 2, 7, 6, 9, 5, 1).distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(listOfInteger);
    }
}
