import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class lec_3_predicate {

    public static void main(String[] args) {
        //Going deep inside predicate.
        //predicate is a functional inteface having a "test" method that return boolean value

//        creating a predicate for even number
//        assign a function to a variable
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // using evenNum predicate
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        for (int i : l)
        {
            if(isEven.test(i))
                System.out.println("im "+i+" even number 😊");
        }

        // using Default methods of Predicate interface
        Predicate<String> p1=s->s.toLowerCase().startsWith("pr");
        Predicate<String> p2=s->s.toLowerCase().endsWith("hu");

        //using AND in this we can add two predicate if both have true then return true
        // AND == && ;

        Predicate<String> and = p2.and(p1);
        System.out.println(and.test("Priyanshu"));

        //using Or in this we can add two predicate if anyone have true then return true
        // OR == || ;

        Predicate<String> or = p1.or(p2);
        System.out.println(or.test("Priyansh"));

        //using NEGATE if we use this is return negate of result;
        // NEGATE == !;

        Predicate<String> negate = p1.negate(); //negate the answer of p1
        System.out.println(negate.test("Ansh")); //return false for who starts with p



    }

}
