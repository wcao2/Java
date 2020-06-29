package cn.ascending.test08oopext.pass;
//https://blog.csdn.net/javazejian/article/details/51192130
public class ref {
    private static User user=null;
    public static void updateUser(User stu){
        stu.setAge(19);
        stu.setName("Lee");
//        System.out.println(stu.getAge());
//        System.out.println(stu.getName());
    }


    /*
    * 1）stu变量被初始化为user值的拷贝，这里是一个对象的引用。
      2）调用stu变量的set方法作用在这个引用对象上，user和stu同时引用的User对象内部值被修改。
      3）方法结束后，stu变量不再使用，被释放，而user还是没有变，依然指向User对象。
      结论：当传递方法参数类型为引用数据类型时，一个方法将修改一个引用数据类型的参数所指向对象的值。
    * */
    public static void main(String[] args) {
        user=new User("Cao",20);
        System.out.println("before call the user: "+user.toString());
        updateUser(user);
        System.out.println("after call the user: "+user.toString());
    }
}
