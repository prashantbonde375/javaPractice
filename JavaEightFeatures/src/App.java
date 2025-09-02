import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        // String[] str = { "prashant", "sagar", "mohit", "akash", "yashvant", "dipak",
        // "lokesh" };

        // Arrays.stream(new String[] { "prashant", "sagar", "mohit", "akash",
        // "yashvant", "dipak", "lokesh" })
        // .filter(name -> name.length() > 6).forEach(System.out::println);

        // Arrays.stream(new String[] { "prashant", "sagar", "mohit", "akash",
        // "yashvant", "dipak", "lokesh" })
        // .map(x -> x.substring(0, 1).toUpperCase() +
        // x.substring(1)).forEach(System.out::println);

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x % 2 == 0).forEach(System.out::print);
    }
}
