package cn.ascending.test26Lambda.practice.calculator;

/*
*  define Calculator interface, it involves abstract method calc 可以将int数字相加得到值
* */
public class  LambdaSum {
    public static void main(String[] args) {
        //1:调用invokeCalc方法, 接口只有一个方法 可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {//new接口必须重写方法
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //2 lambda expression
        invokeCalc(110,20,(a,b)->{
            return a+b;
        });

        //3
        Calculator cl=new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        invokeCalc(10,20,cl);
        invokeCalc(20,30,cl);
    }

    //define a method,two parameters and a Calculator interface 方法内部调用Calculator中的方法计算两个整数和
    public static void invokeCalc(int a,int b,Calculator c){
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
