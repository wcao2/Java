package cn.ascending.test07oop;

import cn.ascending.utils.Phone;

public class Demo04 {
    public static void main(String[] args) {
        Phone b=getPhone();
        System.out.println(b.brand);
        System.out.println(b.color);
        System.out.println(b.price);
    }

    //当使用一个对象类型作为方法的返回值时，返回值其实就是对象的地址值
    public static Phone getPhone(){
        Phone a=new Phone();
        a.brand="apple";
        a.price=8838;
        a.color="yellow";
        //谁调用，把a的地址交给谁
        return a;
    }
}
