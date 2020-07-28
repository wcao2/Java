package cn.ascending.test06Array;
//https://www.youtube.com/watch?v=kD1V60joM0Q&list=PLD3Xyx6ef38yAdTNXD7ntDlaarf8NEoZ4&index=149
//java.util.Math类是与数学相关的工具类　里面提供了大量静态方法　完成与数学相关的操作
/*
*　１: public static double abs(double num)获取绝对值
*  2: public static double ceil(double num)向上取整
*  3: public static double floor(double num)向下取整
*  4: public static long round(double num)四舍五入
*/
public class Demo12Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-132));//132
        System.out.println("======================");
        System.out.println(Math.ceil(21.1));//22.0
        System.out.println("======================");
        System.out.println(Math.floor(21.9));//21.0
        System.out.println("======================");
        System.out.println(Math.round(31.4));//31
        System.out.println("======================");
    }
}
