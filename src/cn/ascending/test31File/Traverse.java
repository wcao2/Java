package cn.ascending.test31File;

import java.io.File;

public class Traverse {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    // public String[] list() :返回一个String数组 表示该File目录中所有子文件或者目录
    public static void show01(){
        File f1=new File("javaBasic/src/cn/ascending/utils");
        String[] arr=f1.list();
        for(String fileName:arr){
            System.out.println(fileName);
        }
    }

    //
    public static void show02(){
        //返回一个File数组 表示该File目录中所有子文件或者目录
        //遍历构造方法中给出的目录 会获取目录中所有的文件/文件夹 并把他们封装成为File对象 多个File对象存储到File数组中
        File f2=new File("javaBasic/src/cn/ascending/utils");
        File[] files=f2.listFiles();
        for(File f:files){
            System.out.println(f);
        }
    }
}
