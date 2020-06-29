package cn.ascending.test31File.credel;

import java.io.File;
import java.io.IOException;

public class Demo01Create {
    public static void main(String[] args) throws IOException {//抛给jvm处理
//        show01();
//        show02();
        show03();
    }

    private static void show01() throws IOException {
        //文件不存在 创建文件 返回true; 不存在 不会创建 返回false
        //只能创建文件 不能创建文件夹
        //创文件的路径必须存在 否则会抛出异常
        File f1=new File("/home/weicao/IdeaProjects/basic-code/javaBasic/src/cn/ascending/utils/test.txt");
        boolean b=f1.createNewFile();
        System.out.println("b "+b);

        File f2=new File("javaBasic/src/cn/ascending/utils/test1.txt");
        System.out.println(f2.createNewFile());
    }

    private static void show02(){
        //文件夹不存在创建返回true 存在 返回false 构造方法中的路径不存在 也返回false
        File f1=new File("javaBasic/src/cn/ascending/utils/test");
        boolean b1=f1.mkdir();
        System.out.println("b1: "+b1);

        File f2=new File("javaBasic/src/cn/ascending/utils/test/111/222");
        boolean b2=f2.mkdirs();
        System.out.println("b2: "+b2);
    }

    private static void show03(){
        //可以删除文件或者文件夹 成功删除true || 文件夹中有内容 不能被删除;构造方法中路径不存在false
        File f1=new File("javaBasic/src/cn/ascending/utils/test/111/222");
        System.out.println("f1: "+f1.delete());
        File f2=new File("javaBasic/src/cn/ascending/utils/test.txt");
        System.out.println("f2: "+f2.delete());
    }
}
