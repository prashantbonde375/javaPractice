package august;

import java.util.Arrays;
import java.util.List;

public class Fourteen_Program {
    public static void main(String[] args) {
        // given string array print only digit from string array.

        String[] str = { "abcd", "123", "xyz", "765", "987" };

        List<Integer> list = Arrays.stream(str).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf).toList();
        System.out.println(list);
    }
}
