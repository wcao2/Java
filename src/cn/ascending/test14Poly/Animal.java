package cn.ascending.test14Poly;


/*
 * 对象的向上转型 其实就是多态的写法
 * 父类对象 对象名=new 子类名称();  Animal animal=new Cat();
 * 右侧创建一个子类对象 把它当做父类来看待使用 创建了一只猫 把它当做动物看待
 *  类似于自动类型转换(Automatic type conversion) 从小范围转向了大范围 int->double
 *  一旦向上转型父类 无法调用子类原来特有的方法
 */
public abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("捉老鼠");
    }
}

class Main{
    public static void main(String[] args) {
        //对象的向上转型 就是父类引用 指向子类对象
        Animal animal=new Cat();
        animal.eat();//编译看左，左边有这个方法；运行看右，右边覆盖重写了
        //animal.catchMouse();  without catchMouse() method anymore


        //如何知道父类引用的对象 本来是什么子类？
        //对象 instanceof 类名称 结果是布尔值 判断前面的对象能不能当做后面对象实例(Determine whether the object in front can be used as an instance of the object behind)
        if(animal instanceof Cat){
            //向下转型 进行还原动作 down casting  in order to use the subclass's method
            //子类名称 对象名=(子类名称) 父类对象 =>将父类对象 还原成为本来的子类对象
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
    }
}
