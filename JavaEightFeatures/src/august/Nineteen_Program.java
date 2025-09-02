package august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Nineteen_Program {
    public static void main(String[] args) {
        //given int array, move zero to beginning
        int[] arr = {2, 0, 3, 0, 1, 0, 5, 0, 6};
        //approach one, make list of zeros then make list of non-zeros and merge that list in third list

        List<Integer> zeroList = Arrays.stream(arr).boxed().filter(x -> x == 0).toList();
        List<Integer> nonZeros = Arrays.stream(arr).boxed().filter(x -> x != 0).toList();

        List<Integer> merged = Stream.concat(zeroList.stream(), nonZeros.stream()).toList();
        System.out.println(merged);
        System.out.println();

        //approach second
        List<Integer> answerList = Arrays.stream(arr).boxed().
                collect(Collectors.partitioningBy(x -> x != 0)).values().stream().flatMap(Collection::stream).toList();

        //Collection::stream Means (x->x.stream())

        System.out.println(answerList);
    }
}
