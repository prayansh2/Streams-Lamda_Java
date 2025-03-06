import java.util.stream.Stream;

public class lec_1_example1 {

    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6,7)
                .forEach(v-> System.out.print(v+" "));

    }
}
