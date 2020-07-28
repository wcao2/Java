package cn.ascending.test10String;

//==是进行对象地址值的比较.若确实需要字符串内容进行比较,则
// 1: public boolean equals(Objects obj) 参数可以是任何对象
//   推荐把常亮字符串写到前面 “abc”.equals(str1); if str1 null, and str1.equals("abc"); ==>null pointer exception

//2: equalsIgnoreCase(String str)
//  忽略大小写 进行内容比较
public class Demo02Equal {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};//static initialized
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true

        String strA="Java";
        String strB="java";
        System.out.println(strA.equals(strB));//false
        System.out.println(strA.equalsIgnoreCase(strB));//true
    }
}
