package cn.ascending.test10String;

//1:字符创内容不可改变
//2:可以共享使用

public class Demo01StrPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        String str5=new String("abc");

        char[] charArray={'a','b','c'};
        String str3=new String(charArray);

        char[] charArray1={'a','b','c'};
        String str4=new String(charArray1);
        //String Literal Pool” or “String Constant Pool”，  字符串常量池
        //只有双引号直接写上的字符串，才在池中
        // 对于基本类型来说，==进行数值的比较; 对于引用类型来说， ==是进行地址值的比较
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false
        System.out.println(str4==str3);//false
        System.out.println(str4==str1);//false
        System.out.println(str5==str1);//false
    }
}
