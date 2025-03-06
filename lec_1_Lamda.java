import java.util.stream.Stream;

public class lec_1_Lamda {

    public static void main(String[] args) {

       //creating stream with generate method
       //passing the lamda function of supplier
        Stream<String> StreamOfString=Stream.generate(()->"hello prayansh");

        //consuming the stream data using forEach and consumer Lamda
        StreamOfString.forEach(str-> System.out.println("printing the data : "+str));
    }

}
