package cn.ascending.test25Exception;

import java.io.IOException;

/*
*  缺点:throws异常代码后面的不会在被执行
*  try catch:异常处理的第二种方式 自己处理异常
*  try{
*       可能有异常的代码
*   }catch(定义一个变量 用来接收try中抛出的异常对象){
*       异常的处理逻辑 一般会记录在log中
*   }
*  1: try可能抛出多个异常对象 可以有多个catch来处理异常对象
*  2: try中产生异常，就会执行catch中处理异常的逻辑， 在执行try catch之后的代码
*  3: 如果try中没有产生异常，就不会执行catch中异常处理的逻辑 执行try中 继续执行try catch之后的代码
* */
public class Demo06try {
    public static void main(String[] args) {
        try {
            readFile("d.txt");
        }catch(IOException e){
            System.out.println("the suffix name is not txt");
        }finally {
            //有些代码 无论是否异常 都希望执行
            System.out.println("release resource");
            //finally中如果有return 一定返回的是return后的 一定要避免在finally中写return
        }
        System.out.println("the rest of code");
    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("suffix name is not correct");
        }
        System.out.println("the path is correct, please read the file");
    }
}
/*
*   当后缀名不是txt, throws把异常抛出给方法调用者 也就是main方法里面的代码,然后catch处理,,
* */