package cn.ascending.test07oop;

public class Demo02oop {
    //面向对象三大特征：封装(Encapsulation) 继承(inherit) 多态（Polymorphism）
    //类是对一类事物的描述，是抽象的(class is a desc of things and it is abstract)
    //对象是一类事物的实例，是具体的(objs are instances of a ccontiguouslass, it is concrete)
    //类是对象的模板，对象是类的实体(classes are templates of objs, and objs are entities of classes)

    //define a class, used to simulate student

    //1:instance-variable outside the method
    String name;
    int age;

    //2: instance-function
    public void eat(){
        System.out.println("恰饭");
    }

}

class Studnet{
    public static void main(String[] args) {
        //1:import package(if not in same package) 2:create new obj 3: use(instance variable or instance method)
        Demo02oop d=new Demo02oop();
        System.out.println(d.age+"  "+d.name);//0,null
        System.out.println("===============================");
        d.name="wei cao";
        d.age=18;
        System.out.println(d.age+"  "+d.name);//18,wei cao
        d.eat();
        System.out.println("==============================");
        Demo02oop d2=d;
        System.out.println(d2.age+"  "+d2.name);//18,wei cao
        d2.eat();
        System.out.println("=============================");
        d2.name="David";//due to d2 and d have same address value
        d2.age=28;
        System.out.print("this is d:     ");
        System.out.println(d.age+"  "+d.name);//David,28
        System.out.print("this is d2:    ");
        System.out.println(d2.age+"  "+d2.name);//David,28
    }

}
