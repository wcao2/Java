package cn.ascending.test31File;

import java.io.File;

public class Demo02MethodInF {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }

    private static void show01() {
        //获取构造方法中的路径 无论路径是绝对的还是相对的 getAbsolutePath永远返回绝对路径
        File f2=new File("a.txt");
        String path2=f2.getAbsolutePath();
        System.out.println(path2);
    }

    private static void show02(){
        //绝对路径就返回绝对的 相对路径就返回相对的
        File f1=new File("/home/weicao/IdeaProjects/basic-code/a.txt");
        File f2=new File("a.txt");
        String path1=f1.getPath();
        String path2=f2.getPath();
        System.out.println("path1: "+path1);
        System.out.println("path2: "+path2);
    }

    private static void show03(){
        //获取结尾部分的文件 或者 文件夹
        File f1=new File("/home/weicao/IdeaProjects/basic-code/a.txt");
        String name1=f1.getName();
        System.out.println(name1);
    }

    private static void show04(){
        //获取构造方法指定的文件大小 以字节为单位
        //不能获取文件夹大小 如果路径不存在 返回0
        File f1=new File("/home/weicao/IdeaProjects/basic-code/a.txt");
        long l1=f1.length();
        System.out.println(l1);
    }
}
