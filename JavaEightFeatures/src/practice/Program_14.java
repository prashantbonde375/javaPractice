package practice;

import java.util.Arrays;
import java.util.List;

public class Program_14 {
    public static void main(String[] args) {
        // create listg that contain only integer
        String[] str = { "abc", "123", "xyz", "543", "ghj", "675" };

        List<Integer> list = Arrays.stream(str).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf).toList();

        System.out.println(list);
    }
}
 