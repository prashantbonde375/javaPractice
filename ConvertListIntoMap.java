import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListIntoMap {
    public static void main(String[] args) {
        List<String> frut = new ArrayList<>();
        frut.add("Mango");
        frut.add("chiku");
        frut.add("dalimb");
        frut.add("banana");
        frut.add("drakshe");
        frut.add("papai");
        frut.add("tarbuj");


        //Convert List to Map
        Map<String, Integer> countMap = frut.stream()
                .collect(Collectors.toMap(fruit -> fruit, String::length));

        // Print the Map
        System.out.println(countMap);
    }
}
