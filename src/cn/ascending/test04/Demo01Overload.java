package cn.ascending.test04;

//重载:overload
//For some methods, they have same aim, we use overload
//methods have same method name but have different parameter lists
//related to(1:the number of parameter 2:parameter type diff 3:the sequence of parameter type)
//donot related to (1:return type 2:parameter name )
/*
    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
    每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
    最常用的地方就是构造器的重载。
*/
public class Demo01Overload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,9,10));
    }
    public static int sum(int a,int b){
        System.out.println("two parameters method excuted");
        return a+b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("three parameters method excuted");
        return a+b+c;
    }

    public static void sum(int a,String b){
        System.out.println("two parameters method excuted");

    }

    public static void sum(String a,int b){
        System.out.println("two parameters method excuted");
    }

    //variable parameters(可变参数)
    //返回值可以相同或者不同
    public static int sum(int...arr){
        System.out.println("the variable function");
        int sum=0;
        //遍历数组 获取数组中每一个元素
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
