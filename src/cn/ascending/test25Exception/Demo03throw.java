package cn.ascending.test25Exception;

/*
*  可使用throw关键字在指定的方法中抛出指定的异常
*  format: throw new  XXXException("the reason of exception")
*
*  1:throw关键字必须在方法内部
*  2:throw后面new的对象必须是Exception或者其子对象
*  3:throw抛出的异常对象 我们就必须处理他
*   a:如果throw后面创建的是RunTimeException(运行期异常)或者其子对象 可以不处理 默认交给jvm 打印异常对象 中断程序
*   b:如果throw后面创建的是编译异常 那必须处理 要么throws 要么try catch
* */
public class Demo03throw {
    public static int getElement(int[] arr,int index){
        //对传递过来的参数进行合法性校验 如果arr is null,抛出空指针异常 告知方法的调用者 传递的数组的值是null
        if(arr==null){
            throw new NullPointerException("the array is null");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("index is not in the useable range");
        }
        int ele=arr[index];
        return ele;
    }
}
