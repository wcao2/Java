package cn.ascending.test13Interface;

public interface MyInterfacePrivate {

    public default void methodDefault1(){
        System.out.println("default method1");
        //methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("default method2");
       // methodCommon();
    }

    //!!!!!!!!!!!!!!! 需要抽取一个公共方法　来解决默认方法之间代码重复的问题　但这个公共方法不应该让实现类使用　应该是私有化的
    //从JAVA9 开始　接口中允许调用私有方法(1:普通私有方法　2:静态私有方法)
    //1: private 返回值类型　方法名称(参数列表){方法体}
    //2:　private　static 返回值类型　方法名称(参数列表){方法体}
    /*private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}

