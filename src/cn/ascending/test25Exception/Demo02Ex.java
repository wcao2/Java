package cn.ascending.test25Exception;

public class Demo02Ex {
    public static int getElement(int[] arr,int index){
        //1:访问了数组中的3索引，而数组中是没有的，jvm就会检测出程序出现异常
        //  jvm会根据异常产生的原因去创建异常对象(include 内容 原因 位置) new ArrayIndexOutOfBoundsException("3")
        //  在 getelement方法中没有处理异常的逻辑，那么jvm就会把异常对象抛出给方法的调用者main方法来处理异常
        int ele=arr[index];
        return ele;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        //2: main方法接收到了异常对象 main也没有异常的处理逻辑 继续把对象抛出给main方法的调用者jvm处理 jvm接收到了异常对象
        //jvm做了两个事儿: a:把异常对象内容 原因 位置以红色字体(red font)打印到控制台 b:jvm会终止当前正在执行的java程序
        int e=getElement(arr,3);
        System.out.println(e);
    }
}
