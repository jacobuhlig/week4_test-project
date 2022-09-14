import java.util.Arrays;
import java.util.List;

public class Ex1 {

    //Create or print a list with the same size, but with each name capitalised (Peter, Jan ...)
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "jan", "john", "janna", "celine");
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .forEach(System.out::println);

    }


    //Change the list above so that all items are sorted alphabetically
    /*public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "jan", "john", "janna", "celine");
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted()
                .forEach(System.out::println);

    }*/


    //Change the list above so that all items are sorted in the reverse order
    /*public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "jan", "john", "janna", "celine");
        names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }*/


    //Change the example above to return a single string, like this:
    /*public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "jan", "john", "janna", "celine");
        String result = "Sorted names as String: " +
                names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }*/
}
