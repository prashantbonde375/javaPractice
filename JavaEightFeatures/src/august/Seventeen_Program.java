package august;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Seventeen_Program {
    public static void main(String[] args) {
        //write stream program to multiply the alternative number
        // IN/pt int[] array = [4,5,1,7,2,9,2];
        // o/p 16

        int[] arr = {4, 5, 1, 7, 2, 9, 2};

        int c = IntStream.range(0, arr.length).filter(x -> x % 2 == 0).map(x -> arr[x]).reduce(1, (a, b) -> a * b);
        System.out.println(c);

    }
}
