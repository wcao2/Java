package cn.ascending.test14Poly.computerPrac;

public class Keyboard implements Usb{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void keyboard(){
        System.out.println("click keyboard");
    }
}
