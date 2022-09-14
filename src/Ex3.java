import java.util.stream.Stream;

public class Ex3 {

    static Stream<Integer> numberStream = Stream.of(2,5,8,6,77,34,23,78,99,12);


    //Print out all numbers sorted ascending.
    public static void main(String[] args) {
        numberStream.sorted().forEach(System.out::println);
    }
        //2,5,6,8,12,23,34,77,78,99


    //Print out all numbers sorted descending.
    /*public static void main(String[] args) {
        numberStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }*/
    //99,78,77,34,23,12,8,6,5,2


    //Print out all EVEN numbers sorted ascending.
    /*public static void main(String[] args) {
        numberStream.filter(n -> n % 2 == 0).sorted().forEach(System.out::println);
    }*/
    //2,6,8,12,34,78


    //Print out all EVEN numbers sorted ascending but skip the first 5 numbers

    //Version 1
    /*public static void main(String[] args) {
        numberStream.filter(n -> n % 2 == 0).sorted().skip(5).forEach(System.out::println);
    }*/
    //78

    //Version 2
    /*public static void main(String[] args) {
        numberStream.skip(5).filter(n -> n % 2 == 0).sorted().forEach(System.out::println);
    }*/
    //12,34,78


    //Print out the max number
    /*public static void main(String[] args) {
        System.out.println(numberStream.collect(Collectors.summarizingInt(Integer::intValue)).getMax());
    }*/
    //99
}