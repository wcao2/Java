package cn.ascending.test14Poly.computerPrac;

public class MainMethod {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.powerOn();

        //1
        Usb usb=new Mouse();//向上转型  左父又子就是多态  多态写法
        c.useDevice(usb);

        //2
        Keyboard k=new Keyboard();//没有使用多态写法
        c.useDevice(k);//向上转型 自动 从小到大 int->double
        //3   使用匿名对象
        c.useDevice(new Keyboard());

        c.powerOff();
    }
}

//1接口的基本使用 2对象的上下转型 3使用接口作为参数