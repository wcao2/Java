package cn.ascending.test03;

public class Demo03Para {
    public static void main(String[] args) {
        m1(5,3);
        System.out.println("================");
        m2();
    }
    //need parameter
    public static void m1(int a,int b){
        int result=a*b;
        System.out.println("the result is "+result);
    }
    //do not need parameter
    public static void m2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, world "+i);
        }
    }
}
