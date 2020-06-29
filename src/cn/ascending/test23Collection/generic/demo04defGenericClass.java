package cn.ascending.test23Collection.generic;

import cn.ascending.utils.Person;

public class demo04defGenericClass<F> {
    private F name;

    public F getName() {
        return name;
    }
    public void setName(F name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //1:不写默认object类型
        demo04defGenericClass gc=new demo04defGenericClass<>();
        gc.setName(123);//or string
        gc.setName(true);
        Object name = gc.getName();//不写默认object类型
        System.out.println(name);
        System.out.println("-------------------");
        //2:泛型使用Integer类型
        demo04defGenericClass<Integer> gc2=new demo04defGenericClass<>();
        gc2.setName(123);
        System.out.println(gc2.getName());
        System.out.println("-------------------");
        //2:泛型使用String类型
        demo04defGenericClass<String> gc3=new demo04defGenericClass<>();
        gc3.setName("abc");
        String name3=gc3.getName();
        System.out.println(name3);
    }
}
