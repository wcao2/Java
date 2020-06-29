package cn.ascending.test10String;

/*
*  String 当中与转换相关的常用方法有:
*  1:public char[] toCharArray() ==>将当前字符串拆分成字符数组作为返回值
*  2:public byte[] getBytes()==>获取当前字符串底层字节数组
*  3:public String replace(CharSequence oldString, CharSequence newString)==>将老字符串替换成新字符串，返回替换之后的结果
*/
public class Demo05StrConvert {
    public static void main(String[] args) {
        //1:转换成字符数组
        char[] chars="Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5
        System.out.println("=================");
        //2:转换成字节数组(byte array)
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            //97 98 99
            System.out.println(bytes[i]);
        }
        System.out.println("=================");
        //3:字符串内容替换
        String str1="How do you do?";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
    }

}
