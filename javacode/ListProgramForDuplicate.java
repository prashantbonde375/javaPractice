import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;


public class ListProgramForDuplicate {
    public static void main(String[] args) {
        List<String> fruites = new ArrayList<>();
        fruites.add("mango");
        fruites.add("dalimb");
        fruites.add("mango");
        fruites.add("ananas");
        fruites.add("chiku");
        fruites.add("dangar");
        fruites.add("tarbuj");
        fruites.add("ananas");

        // Iterate using for loop
        // for (int i = 1; i < fruites.size(); i++) {
        //     System.out.println(fruites.get(i));
        // }

        // Iterate List using for each
        // for(String friut : fruites){
        // System.out.println(friut);
        // }

        // collect unique fruits list
        List<String> uniqList = fruites.stream().distinct().collect(Collectors.toList());

        for(String uniList : uniqList){
            System.out.println(uniList);
        }

        //Alternate way to remove duplicates elements from list

        // Using Set to remove duplicates while maintaining order
        List<String> uniqListOfFruites = new ArrayList<>(new LinkedHashSet<>(fruites));

        for(String uniList : uniqListOfFruites){
            System.out.println(uniList);
        }

    }
}