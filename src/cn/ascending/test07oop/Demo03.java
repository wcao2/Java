package cn.ascending.test07oop;

import cn.ascending.utils.Phone;

//https://www.youtube.com/watch?v=3stlr3oy9d4&list=PLD3Xyx6ef38yAdTNXD7ntDlaarf8NEoZ4&index=105
public class Demo03 {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="apple";
        one.price=799;
        one.color="yellow";
        //当一个对象作为参数传递到方法中，实际上传递的是该对象的地址值
        method(one);
    }
    public static void method(Phone param){
        System.out.println("the address value is: "+param);
        System.out.println(param.color);
        System.out.println(param.price);
        System.out.println(param.brand);
    }
}


