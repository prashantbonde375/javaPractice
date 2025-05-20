package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Program_3 {
    public static void main(String[] args) {

        // find second highest from sentence

        String str = "I am prashantrrr and i am working as a java developer";

        String str1 = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();

        System.out.println(str1);
    }
}
