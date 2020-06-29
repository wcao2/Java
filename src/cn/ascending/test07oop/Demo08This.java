package cn.ascending.test07oop;

public class Demo08This {
    String name;
    //name is instance variable
    public void sayHello(String name){
        //当local variable和instance variable have a same name,根据就近原则，优先使用局部变量
        //如果需要访问本类当中的成员变量，需要 this.成员变量名
        //谁调用方法 谁就是this(dt是this)
        System.out.println("hello "+name+" I am "+this.name);
        System.out.println("to justify this has a same address as dt "+this+" FIRST SHOW");
    }
}

class Person{
    public static void main(String[] args) {
        Demo08This dt=new Demo08This();
        dt.name="Wei Cao";
        dt.sayHello("Chen");
        System.out.println("to justify dt has a same address as this  "+dt+" SECOND SHOW");
    }
}
