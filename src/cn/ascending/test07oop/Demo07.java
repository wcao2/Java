package cn.ascending.test07oop;

public class Demo07 {
    String name;
    //使用private,本类当中依旧可以随意访问，超出本类之外，不能再访问了
    private int age;

    public void show(){
        System.out.println("my name is "+name+" , my age is "+age);
    }

    //专门获取age
    public int getAge() {
        return age;
    }
    //专门向成员变量设置数据
    public void setAge(int age) {
        if(age<100&&age>=0){
            this.age = age;
        }else{
            System.out.println("数据不合理");
            //this.age=10;
        }
    }
}

class test{
    public static void main(String[] args) {
        Demo07 d7=new Demo07();
        d7.show();
        d7.name="David";
        d7.setAge(210);
        d7.show();
    }
}
