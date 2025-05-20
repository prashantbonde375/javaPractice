package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Program_1 {
    public static void main(String[] args) {
        //Program First from playlist of 60 program for Java 8 features
        //Given sentence and find the word that has highest length
        String str = "I am Prashant and i am Java Developer ...!";

        String answer = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(answer);
    }
}
