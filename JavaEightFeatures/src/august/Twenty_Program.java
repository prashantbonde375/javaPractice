package august;

import java.util.Arrays;

public class Twenty_Program {
    public static void main(String[] args) {
        //given array of int[] , return true if it contains distinct value and false otherwise
        int[] arr = {0, 2, 4, 3, 5, 1, 9};

        boolean bn = Arrays.stream(arr).distinct().count() == arr.length;

        System.out.println("Contains only distinct values:--- " + bn);
    }
}
