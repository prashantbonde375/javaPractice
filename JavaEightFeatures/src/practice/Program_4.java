package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Program_4 {
    public static void main(String[] args) {
        // find the 2nd highest word length in the sentence
        String str = "p pr pra pras prash prasha prashan";

        int a = Arrays.stream(str.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(a);
    }
}
