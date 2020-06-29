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
}
