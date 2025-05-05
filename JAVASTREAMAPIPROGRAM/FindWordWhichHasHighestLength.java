package JAVASTREAMAPIPROGRAM;

import java.util.Arrays;
import java.util.Comparator;

public class FindWordWhichHasHighestLength {
    public static void main(String[] args) {
        String lengthToCheck = "I am Prashantbonde and Exploring Core Java from Stream Api.";

        String highestNUmberOfLength = Arrays.stream(lengthToCheck.split(" ")).max(Comparator.comparing(String::length))
                .get();
        System.out.println(highestNUmberOfLength);
    }
}
