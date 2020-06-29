package cn.ascending.test16Innerclass;

/*
*  如果一个类是定义在一个[方法]的内部 就是局部内部类
*  !!!!!!!!!!!只有当前所属的方法才能使用它 出了这个方法外面就不能用了
*  修饰符 class 外部类名称{
*       修饰符 返回值类型 外部类方法名称(参数列表){
*           class 局部内部类名称{
*                   //....
*           }
*       }
*  }
*
*
* */
public class Demo204 {
    public void methodOuter(){
        class Inner{//局部内部类:  Local class which is defined in the method
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        //创建对象
        Inner i=new Inner();
        i.methodInner();
    }
}

class main{
    public static void main(String[] args) {
        Demo204 outer=new Demo204();
        outer.methodOuter();
    }
}
