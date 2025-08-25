package august;

import java.util.Arrays;
import java.util.Comparator;

public class Four_Program {
    public static void main(String[] args) {

        // given sentence, find second highest length word
        String str = "i am prashant and i am java developer";

        int a = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .get();

        System.out.println(a);
    }
}
