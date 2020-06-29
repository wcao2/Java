package cn.ascending.test31File;

import java.io.File;

public class Demo03Judgement {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show01(){
        File f1=new File("/home/weicao/IdeaProjects/basic-code");
        //文件或者目录是否实际存在
        System.out.println(f1.exists());
    }

    private static void show02(){
        //此File是否为目录
        File f1=new File("/home/weicao/IdeaProjects/basic-code");
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            //此File是否为文件
            System.out.println(f1.isFile());
        }
    }
}
