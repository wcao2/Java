package cn.ascending.test03;

public class Demo02 {
    public static void main(String[] args) {
        //call the method
        //1:单独调用
        sum(10,2);
        System.out.println("==================");
        //2:打印调用
        System.out.println(sum(10,20));
        System.out.println("==================");
        //3:赋值调用
        int num=sum(15,20);
        System.out.println(num);
    }

    public static int sum(int a, int b){
        int result=a+b;
        return result;
    }
}
