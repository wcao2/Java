package cn.ascending.test10String;

public class Demo03StrGet {
    public static void main(String[] args) {
        //1:获取字符串长度
        int length="1231asda".length();
        System.out.println(length);
        System.out.println("===============");
        //2: 拼接字符串
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str3);
        System.out.println("===============");
        //3: 获取指定位置的单个字符
        char ch=str1.charAt(1);//e
        System.out.println("at the index of 1 is "+ch);
        System.out.println("===============");
        //4: 查找小字符串在大字符窜出现的第一次的索引位置, 如果没有， 返回-1
        int a="HelloWorld".indexOf("llo");
        System.out.println(a);//2
    }
}
