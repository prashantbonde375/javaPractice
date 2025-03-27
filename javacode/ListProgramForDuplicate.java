import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;


public class ListProgramForDuplicate {
    public static void main(String[] args) {
        List<String> fruites = new ArrayList<>();
        fruites.add("mango");
        fruites.add("dalimb");
        fruites.add("dalimb");
        fruites.add("mango");
        fruites.add("ananas");
        fruites.add("chiku");
        fruites.add("chiku");
        fruites.add("chiku");
        fruites.add("chiku");
        fruites.add("dangar");
        fruites.add("dangar");
        fruites.add("tarbuj");
        fruites.add("ananas");

        // Iterate using for loop
        for (int i = 1; i < fruites.size(); i++) {
            System.out.println(fruites.get(i));
        }

        // Iterate List using for each
        for(String friut : fruites){
        System.out.println(friut);
        }

        // collect unique fruits list
        List<String> uniqList = fruites.stream().distinct().collect(Collectors.toList());

        for(String uniList : uniqList){
            System.out.println(uniList);
        }

        //Alternate way to remove duplicates elements from list

        // Using Set to remove duplicates while maintaining order
        List<String> uniqListOfFruites = new ArrayList<>(new LinkedHashSet<>(fruites));

        //using stream conver to set from list
        List<String> setUsing = fruites.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());


        for(String uniList : setUsing){
            System.out.println(uniList);
        }

         Map<String, Long> fruitCount = fruites.stream()
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()));

        // Printing the fruit count
        fruitCount.forEach((fruit, count) -> System.out.println(fruit + " -> " + count));
    

        // Using HashMap to count occurrences
        Map<String, Integer> fruitCounts = new HashMap<>();

        for (String fruit : fruites) {
            if (fruitCounts.containsKey(fruit)) {
                fruitCounts.put(fruit, fruitCounts.get(fruit) + 1);
            } else {
                fruitCounts.put(fruit, 1);
            }
        }

        // Printing the fruit count
        for (Map.Entry<String, Integer> entry : fruitCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}