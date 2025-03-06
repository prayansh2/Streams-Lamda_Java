import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class lec_1 {
    public static void main(String[] args) {


        //creating a supplier for generate method
        Supplier<String> supplier =new Supplier<String>() {
            @Override
            public String get() {
                return "hello prayansh!!";
            }
        };

        //creating a consumer for foreach Method that consume the data
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println("printing the string : "+str);
            }
        };


        //creating a stream with generate method that create a infinite no. string stream
        //using supplier and consumer method
        Stream<String> streamOfString=Stream.generate(supplier);
        streamOfString.forEach(consumer);

//        output printing the string again and again bcz generate method generating a infinite stream


    }
}
