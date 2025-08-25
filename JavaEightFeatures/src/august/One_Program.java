package august;

import java.util.Arrays;
import java.util.Comparator;

public class One_Program {
    public static void main(String[] args) {

        // given sentence, find word that has highest length of word
        String str = "I am Prashant and i am learning Java Eight Programming";
        System.out.println(str);

        String ans = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("Highest length word is :- " + ans);
    }
}
