package cn.ascending.test02;

//when first use this class, execute static code block.
//and the static(execute first) over non-static
//aim: assign value to static variables(JDBC)
public class StaticCodeBlock {
    public void method(){
        System.out.println("this is a normal method");
    }
    static {
        System.out.println("static code block execute");
    }
}

class Test{
    public static void main(String[] args) {
        StaticCodeBlock scb=new StaticCodeBlock();
        scb.method();
    }
}