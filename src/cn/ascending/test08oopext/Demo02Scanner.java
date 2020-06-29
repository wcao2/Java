package cn.ascending.test08oopext;

/*Scanner 可以实现键盘输入数据到程序当中
引用类型的一般使用步骤
    1:导包(只有java.lang包下的 不需要导包)
    2:创建: 类名称 对象名= new 类名称();
    3:使用 : 对象名.成员方法名
*/
import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        //2:创建对象
        Scanner sc=new Scanner(System.in);//System.in 代表从键盘输入
        //3:获取键盘输入的int数字
//        int num=sc.nextInt();
//        System.out.println("the number is "+num);
//        //3:获取键盘输入的字符串
//        String str=sc.next();
//        System.out.println("the string is "+num);
        System.out.println("=========================");
        //键盘输入两个int并求和117
        System.out.println("please type the first number");
        int a=sc.nextInt();
        System.out.println("please type the second number");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("the result is "+result);
    }
}
