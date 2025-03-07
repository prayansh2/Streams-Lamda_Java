import java.util.Arrays;
import java.util.stream.Stream;

public class lec_2 {

    public static void main(String[] args) {

        Integer numbers[]={1,2,3,4,5,6,7,8,9,10};

        //printing the numbers greater then 5 without streams

        for(int num:numbers)
        {
            if(num>5)
                System.out.println("i'm "+ num +" greater then 5");
        }

        //With streams
        //1. createing the stream of array;
        Stream<Integer> streamOfNumbers= Arrays.stream(numbers);

        //2. filter the stream of numbers
        // filter except a predicate that is a functional interface have a Test method
        Stream<Integer> filteredStream = streamOfNumbers.filter(num -> num > 5);

        //3. printing the filtered stream
        filteredStream.forEach(num-> System.out.println(num));

    }


}
