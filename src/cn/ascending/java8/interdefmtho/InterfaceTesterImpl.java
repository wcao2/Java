package cn.ascending.java8.interdefmtho;

//1
public class InterfaceTesterImpl implements InterfaceTester{
    @Override
    public void defMethod01() {
        System.out.println("override default method 01, still use default method");
    }

    @Override
    public void absMethod() {
        System.out.println("implementation abs method");
    }

    public static void main(String[] args) {
        //1.1
        InterfaceTester impl1=new InterfaceTesterImpl();
        impl1.absMethod();
        impl1.defMethod01();
        impl1.defMethod();
        System.out.println("====================");
        //2
        InterfaceTester impl=()->{//implementation absMethod()
            System.out.println("this is an implementation of absMethod method");
        };
        impl.defMethod();
        impl.defMethod01();
        impl.absMethod();

    }
}
