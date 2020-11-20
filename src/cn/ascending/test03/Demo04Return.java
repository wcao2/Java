package cn.ascending.test03;

public class Demo04Return {
    public static void main(String[] args) {
        int num=getSum(10,20);
        System.out.println("the return value is "+num);
        System.out.println("----------------------------");
        printSum(10,20);
    }
    //1:return value
    public static int getSum(int a,int b){
        int result=a+b;
        return result;
    }

    //2:no return value
    public static void printSum(int a,int b){
        int result=a+b;
        System.out.println("without return value "+result);
    }
    // break, return, continue区别
    //https://blog.csdn.net/adminabcd/article/details/46793209
    //return 的作用是退出循环体所在的函数，相当于结束该方法。
    //break 的作用是结束循环，跳出循环体，执行后面的程序。
    //continue 的作用是结束此次循环，进行下一次循环；

}
