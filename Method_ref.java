import java.util.function.*;

@FunctionalInterface
interface exp1{
    int add(int a,int b);
}
@FunctionalInterface
interface exp2{
    int add(Method_ref ref,int a,int b);
}




public class Method_ref {

    public int doAdd(int a ,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        Consumer<String> ref1=System.out::println;
        ref1.accept("systm se hoon bhaii");

        BiFunction<Integer,Integer,Integer> ref2=Integer::sum;
        Integer apply = ref2.apply(1, 2);
        ref1.accept(apply+"");

        //createing a method refrence for functional interface method

        exp1 ep= Method_ref::sum;
        int add = ep.add(1, 2);
        ref1.accept(add+" method refrence of exp1 add function");

        //method refrence of instance method or non static member function
        Method_ref obj=new Method_ref();
        exp1 ep2=obj::doAdd;
        int add1 = ep2.add(2, 2);
        ref1.accept(add1+" method refrence of a non static function");

        //method refrence of instance method or non static member function of inbuilt class
        Function<String,String> ref3=String::toUpperCase;
        String priyanshu = ref3.apply("priyanshu");
        ref1.accept(priyanshu);

        exp2 ep3=Method_ref::doAdd;
        int add2 = ep3.add(new Method_ref(), 3, 4);
        ref1.accept(add2+" passing the object to access instance fun. of class");





    }

    public static int sum(int a,int b){
        return a+b;
    }


}
