package cn.ascending.test10String;

import java.util.Scanner;

//convert array[1,2,3] to a String [word1#word2#word3]
/*
* 1:define an int[], content is 1,2,3
* 2: define a method, convert array to string
 */
public class Demo07Prac {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String result=fromArrayToString(array);
        System.out.println(result);

        //键盘输入一个字符串，统计各种字符出现的次数
        //既然用到键盘输入 肯定是scanner 键盘输入的字符串，String str=sc.next()
        //定义四个变量　分别代表四种字符各自出现的次数
        //String-->Char[] 方法就是toCharArray(转换成字符数组)
        //遍历char[]字符数组　对当前字符的种类进行判断,并且用四个变量进行++操作
        //打印输出四个变量，分别代表四种字符出现次数
        System.out.println("======================");
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a string");
        String input=sc.next();//获取键盘输入的字符串
        int countUpper=0;
        int countLower=0;
        int countNum=0;
        int countOther=0;
        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            //char 类型进行数学运算可以提升为int类型
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNum++;
            }else {
                countOther++;
            }
        }
        System.out.println("uppercase has "+countUpper);
        System.out.println("lowercase has "+countLower);
        System.out.println("number has "+countNum);
        System.out.println("other has "+countOther);
    }

    public static String fromArrayToString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="word"+array[i]+"]";
            }else{
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }




}
