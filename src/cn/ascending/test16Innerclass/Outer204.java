package cn.ascending.test16Innerclass;

public class    Outer204 {
    int num1=10;//外部类成员变量
    int num=10;

    //成员内部类 (局部内部类，类定义在方法内部，只有该方法可以使用它)
    public class Inner{
        int num=20;//内部类成员变量

        public void methodInner(){
            int num=30;//内部类方法局部变量
            System.out.println(num);//局部变量 就近原则 30
            System.out.println(this.num);//20内部成员变量 20
            System.out.println(num1);//10
            System.out.println(num);//重名的外部类成员变量 10
        }
    }
}

class Main{
    public static void main(String[] args) {
        Outer204.Inner obj=new Outer204().new Inner();
        obj.methodInner();
    }
}
