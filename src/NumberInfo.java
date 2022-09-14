public class NumberInfo {

    int number;
    String info;

    public NumberInfo(int n) {
        this.number = n;
        this.info = n%2==0 ? "Even": "uneven";
    }

    /*static Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);

    public static void main(String[] args) {

    }*/


}
