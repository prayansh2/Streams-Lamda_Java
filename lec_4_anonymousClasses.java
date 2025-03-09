public class lec_4_anonymousClasses {

    @FunctionalInterface
    interface myInterface{
        void sayhello();
    }

    interface myInterface2{
        void helloWrld();
        void helloWorld2();
    }

    public static void main(String[] args) {

      //we create anomymousclass if we do not want to implement
      // interface or use the functions of interface

      myInterface2 inter=new myInterface2() {
          @Override
          public void helloWrld() {
              System.out.println("helloWorld1...");
          }

          @Override
          public void helloWorld2() {
              System.out.println("helloworld2...");
          }
      };

        inter.helloWrld();
        inter.helloWorld2();

    }

}
