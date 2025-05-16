package javaeightfeatures;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(3));
        System.out.println(predicate.test(2) + "\n");

        // for IntPredicate

        IntPredicate intPredicate = i -> i % 2 == 0;
        System.out.println(intPredicate.test(2));
        System.out.println(intPredicate.test(3));

        // to check String length() is less than or greater than
        Predicate<String> str = s -> s.length() > 5;
        System.out.println("The length of string is getter:- " + str.test("Prashant"));
    }
}
