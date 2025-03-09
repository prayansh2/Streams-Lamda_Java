import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class lec_3_function {

    public static void main(String[] args) {
        //Going deep inside Function.
        //Function is a functional inteface having "apply" method that return what we want

        Function<Integer, Integer> func1 = x -> x * 2;

        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> updatedList = new ArrayList<>();
        for (int i : l) {
            updatedList.add(func1.apply(i));
        }

        System.out.println(updatedList);

        //woking on Default methods

        Function<Integer, Integer> fun1 = x -> x * 2;
        Function<Integer, Integer> fun2 = x -> x * x * x;

        //andThen method are create a pipeline of functions the function result
        //go as an input for others and soon...

        Function<Integer, Integer> addThen = fun1.andThen(fun2);
        System.out.println(addThen.apply(2));

        //compose method
        //reverse the order of functions
        Function<Integer, Integer> compose = fun1.compose(fun2);
        System.out.println(compose.apply(2));

        //static methods of Functions
        //identity method reatun the same value that you give as input
        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("Priyanshu"));


    }

}
