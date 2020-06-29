package cn.ascending.test07oop;

//面向对象三大特征：封装(Encapsulation) 继承(inherit) 多态（Polymorphism）
//方法就是一钟封装，private也是一种封装
public class Demo06 {

    public static void main(String[] args) {
        int[] array={4,1,2,3,6,2,71};
        int max=getMax(array);
        System.out.println("the max value is "+max);
    }

    //this is Encapsulation
    //对于一些细节信息隐藏起来，对于外界不可见
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}


