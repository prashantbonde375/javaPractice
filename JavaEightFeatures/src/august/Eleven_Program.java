package august;

import java.util.Arrays;

public class Eleven_Program {
    public static void main(String[] args) {

        // given sentence, find first non-occurrence if character
        String str = "hello prashant Prashant";

        // first way
        String ans = Arrays.stream(str.split("")).filter(x -> str.indexOf(x) == str.lastIndexOf(x)).findFirst().get();
        System.out.println(ans);
    }
}
