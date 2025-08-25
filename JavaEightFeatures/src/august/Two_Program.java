package august;

import java.util.Arrays;

public class Two_Program {
    public static void main(String[] args) {

        // given string, remove duplicates character from string.
        String str = "deadea";

        Arrays.stream(str.split("")).distinct().forEach(System.out::println);
    }
}
