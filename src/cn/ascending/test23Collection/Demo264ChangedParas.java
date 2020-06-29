package cn.ascending.test23Collection;

/*
*  before JDK1.5 当前方法参数列表的数据类型已经确定 但是参数个数不确定
*  修饰符 返回值类型 方法名(数据类型...变量名){}
*  可变参数(variable parameters)的底层就是一个数组 根据传递参数个数不同 会创建不同长度的数组 来存储这些参数 可以是0个 到 多个
* */
public class Demo264ChangedParas {
    public static void main(String[] args) {
        int i=add(10,20,30);
        System.out.println(i);
    }

    //定义计算0到n个整数和的方法(数据类型已经确定int, 参数的个数不确定)
    //1: 一个方法的参数列表 只能有一个可变参数 int...a, int...b 这样不行
    //2: 如果方法的参数有多个， 可变参数必须写在参数列表末尾
    /*
    *   add(); 就会创建一个长度为0的数组 new int[0];
    *   add(10); 就会创建一个长度为1的数组 new int[]{10};
    *   add(10,20); 就会创建一个长度为2的数组 new int[]{10,20};
    * */
    public static int add(int...arr){
        int sum=0;
        //遍历数组 获取数组中每一个元素
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}