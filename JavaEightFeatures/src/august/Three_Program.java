package august;

import java.util.Arrays;
import java.util.Comparator;

public class Three_Program {
    public static void main(String[] args) {

        // second highest length word from sentence
        String str = "I am Prashant and i am learning Java Eight Programming";

        String ans = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
                .findFirst().get();
        System.out.println(ans);
    }
}
