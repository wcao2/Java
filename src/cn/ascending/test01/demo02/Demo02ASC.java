package cn.ascending.test01.demo02;

public class Demo02ASC {
    public static void main(String[] args) {
        char zifu1='1';
        //ASC 码表  ==》 Unicode 万国码表
        //显示字符一对应的数字
        System.out.println(zifu1+0);//49

        char zifu2='A';//其实底层保存的是65
        //左边int, 右边char, 自动类型转换  char->int
        int num=zifu2;


    }
}
