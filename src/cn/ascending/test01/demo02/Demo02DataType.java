package cn.ascending.test01.demo02;

public class Demo02DataType {
    //1:basic data type: 整数:byte short char int long(add L at the end); float(f), double;  boolean
    //2: Reference data type:字符串，类， 接口，Lambda


    public static void main(String[] args) {
        //Type conversion(auto, )
        //1:auto: byte->short->int->long->float->double;
        long num1 = 100;//int->long
        System.out.println(num1);
        float num2 = 30L;//long->float
        System.out.println(num2);

        //Coercion
        int num3=(int)100L;
        System.out.println(num3);

        //int num4=(int)60000000000000000000000L; ERROT ACCURACY LOSS

        //double->int Coercion
        int num5=(int)3.99;//cut off the decimal parts
        System.out.println(num5);

        //byte,short,char->int(once char is used in computation)
        char zifu1='A';
        System.out.println(zifu1+1);//65+1

        byte num6=4;
        byte num7=5;
        //byte+short+char->int+int+int->int
        //右侧数值大小不能超过左侧类型范围
        //byte result=num6+num7;
        int result=num6+num7;
        System.out.println(result);

    }


}
