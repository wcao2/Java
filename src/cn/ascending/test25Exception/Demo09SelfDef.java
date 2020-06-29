package cn.ascending.test25Exception;

/*
*  自定义异常 必须继承Exception 或者 RunTimeException
*  继承Exception: 那么自定义异常类就是一个编译期异常 如果方法内部抛出编译器异常 就必须处理这个异常 要么throws 要么try catch
*  继承RunTimeException: 自定义的异常类就是一个运行期异常 无需处理 交给虚拟机处理(中断处理)
* */
public class Demo09SelfDef extends Exception{
    //添加一个带异常信息构造方法 查看源码发现 所有异常类都会有一个带异常信息的构造方法 方法内部会调用父类带异常信息的构造方法 让父类处理这个异常信息
    public Demo09SelfDef(String message){
        super(message);
    }
}
