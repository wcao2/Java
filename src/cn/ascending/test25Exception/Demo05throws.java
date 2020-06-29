package cn.ascending.test25Exception;


import java.io.FileNotFoundException;

/*
*  throws 异常处理的第一张方式 交给别人处理
*  当方法内部抛出异常对象的时候 我们则必须处理这个异常对象
*  可以使用throws关键字处理异常对象 会把异常对象声明抛出给方法的调用者处理(
        Will throw the exception object to the caller of the method) 最终交给jvm处理(中断处理)
*  在方法声明时使用
*  修饰符 返回值类型 方法名(参数列表) throws{ throw new AAAException("reason...");throw new BBBException("reason...");}
* */
public class Demo05throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("c:\\a.tx");
    }
    //对文件路径进行合法性判断 若不是c:\\a.txt 那么就抛出文件找不到异常 告知方法的调用者处理
    public static void readFile(String fileName) throws FileNotFoundException{
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递文件的路径不是...");//this is a compile ex, not run time ex
        }
        System.out.println("the path is correct, let's read the file");
    }
}
