package practice;

import java.util.Arrays;

public class Program_11 {
    public static void main(String[] args) {
        // Find First Non Repeated Character
        String str = "Hello world";

        String answer = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst()
                .get();

        System.out.println(answer);
    }
}
