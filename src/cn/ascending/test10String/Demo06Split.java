package cn.ascending.test10String;

/*
* public String[] split(String regex) 按照参数的规则,将字符串分割成若干部分
*/
public class Demo06Split {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] array1=str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(str1);
        System.out.println("=================");
        String str2="aaa bbb ccc";
        String[] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println(str2);
    }
}
