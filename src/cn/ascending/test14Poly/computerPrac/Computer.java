package cn.ascending.test14Poly.computerPrac;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }
    public void powerOff(){
        System.out.println("关机");
    }

    //使用USB设备的方法 使用接口作为方法的参数
    public void useDevice(Usb usb){
        usb.open();
        if(usb instanceof Mouse){//先判断
            Mouse m=(Mouse)usb;//向下转型
            m.click();
        }else if(usb instanceof Keyboard){
            Keyboard k=(Keyboard) usb;//向下转型
            k.keyboard();
        }
        usb.close();
    }
}
