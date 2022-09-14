import java.util.stream.IntStream;

public class Ex2 {

    //What's the total amount of numbers in the stream (20 or 21)?
    public static void main(String[] args) {
        IntStream.range(1, 21).forEach(System.out::println);
        System.out.println(IntStream.range(1, 21).count());
    }
        //20


    //What's the total of all the numbers?
    /*public static void main(String[] args) {
        System.out.println(IntStream.range(1, 21).sum());
    }*/
        //210


    //What's the average value of all the numbers?
    /*public static void main(String[] args) {
        System.out.println(IntStream.range(1, 21).average().getAsDouble());
    }*/
        //10.5


    //Raise all numbers to the power of two and print the first 6 numbers
   /* public static void main(String[] args) {
        IntStream.range(1, 21).map(n -> n*n).limit(6).forEach(System.out::println);
    }*/
        //1,4,9,16,25,36


    //Raise all numbers to the power of two, and print all the even numbers
    /*public static void main(String[] args) {
        IntStream.range(1, 21).map(n -> n*n).filter(n -> n % 2 == 0).forEach(System.out::println);
    }*/
        //4, 16, 36, 64, 100, 144, 196, 256, 324, 400
}
