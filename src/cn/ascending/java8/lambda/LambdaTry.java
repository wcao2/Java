package cn.ascending.java8.lambda;

//Syntax of lambda expression  :  (parameter_list) -> {function_body}

//To use lambda expression, you need to either create your own functional interface or use the pre defined functional interface provided by Java.

//functional interface:An interface with only one [abstract] method is called functional interface(or Single Abstract method interface)
//for example: Runnable, callable, ActionListener etc.
public class LambdaTry {

    //define a functional Interface
    @FunctionalInterface
    /*public abstract*/ interface MyFunctionInterface{
        /*public abstract */String myFunction(String str);
    }

    //1.1
    static class MyFunctionInterfaceImpl implements MyFunctionInterface{

        @Override
        public String myFunction(String str) {
            return "Hello "+str;
        }
    }

    public static void main(String[] args) {
        //1.2
        LambdaTry.MyFunctionInterface mif1=new LambdaTry.MyFunctionInterfaceImpl();
        System.out.println(mif1.myFunction("Wayne"));

        //2: create anonymous inner classes.
        MyFunctionInterface mif2=new MyFunctionInterface() {
            @Override
            public String myFunction(String str) {
                return "Hello "+str;
            }
        };
        System.out.println(mif2.myFunction("Wei"));
        //3
        new MyFunctionInterface() {
            @Override
            public String myFunction(String str) {
                return "Hello "+str;
            }
        }.myFunction("123");
        //4 (str) is the only one fun's parameter in that functional interface
        MyFunctionInterface mif3=(str)->"Hello again "+str;
        System.out.println(mif3.myFunction("Wei Cao(Wayne)"));
    }
}
