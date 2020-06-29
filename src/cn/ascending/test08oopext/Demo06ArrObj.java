package cn.ascending.test08oopext;

/*
*   define an array, to store the Person objects 3 times
* */
public class Demo06ArrObj {
    private String name;
    private int age;

    public Demo06ArrObj() {
    }

    public Demo06ArrObj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main{
    public static void main(String[] args) {
        Demo06ArrObj d1=new Demo06ArrObj("wei",19);
        Demo06ArrObj d2=new Demo06ArrObj("cao",20);
        Demo06ArrObj d3=new Demo06ArrObj("David",0 );

        //动态初始化
        Demo06ArrObj[] p=new Demo06ArrObj[3];

        p[0]=d1;//将one中的地址值赋值到数组的0号元素位置
        p[1]=d2;
        p[2]=d3;
        System.out.println(p[0]);//地址值
        System.out.println(p[1].getName());//cao
        System.out.println(d2.getName());//cao
    }
}
