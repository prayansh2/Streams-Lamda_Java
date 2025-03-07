import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsWorkFlow {

    public static void main(String[] args) {

        //creating the array of integers
        Integer numbers[]={1,2,3,4,5,6,7,8,9,10};

        //create stream of array
        Stream<Integer> arrayStream= Arrays.stream(numbers);

        //create a pipeline that print only even numbers
        arrayStream
                .peek(num-> System.out.println("🔄️processing on number : "+num))
                .filter(num->{
                    System.out.println("🔀applying filter on : "+num);
                    return num%2==0;
                })
                .forEach(num->{
                    System.out.println("im "+ num +" even number 😊");
                });

        /* every number is go through this pipeline completely then only
        the nect number came into pipeline as in this example first 1 came
         then first go to peek then in filter then move forward to forEach
         if satisfy the filter condition and soon... then next number came

         for odd numbers the flow -
         🔄️processing on number : 1,3,5,7,9
         🔀applying filter on : 1,3,5,7,9
         not go in for each because they not satisfy the filter condition


         for even numbers the flow -
         🔄️processing on number : 2,4,6,8,10
         🔀applying filter on : 2,4,6,8,10
          im "number" even number 😊
          all even number go inside the forEach and print

         */
    }

}
