package cn.ascending.test08oopext.pass;

public class deep {
    private static User u1=null;
    private static User u2=null;

    public static void swap(User x,User y){
        User temp =x;
        x=y;
        y=temp;
    }
    /*
    * 我们发现U1和U2的值并没有发生变化，也就是方法并没有改变存储在变量user和stu中的对象引用。
    * swap方法的参数x和y被初始化为两个对象引用的拷贝(the copy of the two obj reference)，这个方法交换的是这两个拷贝的值而已，
    * 最终，所做的事都是白费力气罢了。在方法结束后x，y将被丢弃，而原来的变量user和stu仍然引用这个方法调用之前所引用的对象
    *
    * java函数在传递引用数据类型时，也只是拷贝了引用(reference)的值罢了，之所以能修改引用数据是因为它们同时指向了一个对象
    * */

    public static void main(String[] args) {
        u1 = new User("user",26);
        u2 = new User("stu",18);
        System.out.println("调用前user的值："+u1.toString());
        System.out.println("调用前stu的值："+u2.toString());
        swap(u1,u2);
        System.out.println("调用后user的值："+u1.toString());
        System.out.println("调用后stu的值："+u2.toString());
    }

}
