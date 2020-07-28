package cn.ascending.test05Comparable;


public class Goods implements Comparable {
    private String name;
    private int price;

    //define how to sort
    @Override
    public int compareTo(Object o) {
        /*/如何知道父类引用的对象 本来是什么子类？
        //对象 instanceof 类名称 结果是布尔值 判断前面的对象能不能当做后面对象实例
        if(animal instanceof Cat){
            //向下转型 进行还原动作 down casting
            //子类名称 对象名=(子类名称) 父类对象 =>将父类对象 还原成为本来的子类对象
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }*/
        //instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
        if(o instanceof Goods){// Object o=new Goods()
            Goods goods=(Goods)o;//downcasting
/*            if(this.price>goods.price){
                return -1;//降序
            }
            return 1;//升序*/
            return this.price-goods.price;//升序
        }
        throw new RuntimeException("diff data type/");
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
