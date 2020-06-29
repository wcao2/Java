package cn.ascending.test08oopext.pass;

public class ValuePass {

    private static int x=10;

    //1:The "value" is initialized to a copy of the x value
    public static void updateValue(int value){
        //2:Value is multiplied by 3 and equals 30, but note that the value of x is still 10
        value=3*value;
        //System.out.println(value);
    }
    //3:After the end of this method, the parameter variable "value" is no longer used and is gc.

    public static void main(String[] args) {
        System.out.println("before call the method "+x);//10

        updateValue(x);
        System.out.println("after call the method"+x);//10

    }
}
