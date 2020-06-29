package cn.ascending.test31File;

import java.io.File;

public class Demo01f {
    //四个静态成员变量
    public static void main(String[] args) {
        String pathSeparator= File.pathSeparator;
        System.out.println(pathSeparator);  //路径分隔符 window:分好 lunix:冒号

        String separator=File.separator;
        System.out.println(separator);//文件名称分隔符 windows:\ linux:/

        show01();
        show02("c:/","a.txt");

    }
    //File类构造方法
    /*
     *  File(String pathname) 通过将给定路径名字字符串转换为抽象路径名来创建一个新 File实例
     *  路径可以是相对路径 也可以是绝对路径
     *  路径可以是存在的 也可以是不存在的
     *  只是把字符串路径封装为File对象 不考虑路径真假情况
     * */
    private static void show01(){
        File f1=new File("c/asd/asd");
        System.out.println(f1);//override object's toString()  c/asd/asd  toString()调用的就是getPath方法
    }

    private static void show02(String parent, String son){
        File f2=new File(parent,son);
        System.out.println(f2);
    }

    private static void show03(){
        File parent=new File("c:/asd");
        File f3=new File(parent,"hello.java");
        System.out.println(f3);
    }
}
