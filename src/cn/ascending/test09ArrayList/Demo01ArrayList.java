package cn.ascending.test09ArrayList;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
*   数组的长度不可以改变.但是ArrayList集合的长度是可以随便改变
* */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //diamond bracket 代表泛型,装在集合中的所有元素,全部统一是什么类型
        //泛型只能是引用类型 不能是基本类型
        //从JDK1.7开始，右侧的 angle brackets可以不写内容 但angle brackets仍需在那儿
        ArrayList<String> list=new ArrayList<>();
        //对于ArrayList来说,直接打印得到的不是地址值，而是内容，如果内容是空，得到的是[]
        System.out.println(list);
        //向集合中添加数据
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("夏提古丽");
        list.add("夏提古丽");
        System.out.println("添加后  "+list);
        list.forEach(i->{
            System.out.println(i);
        });
        System.out.println(list.toString());//[迪丽热巴, 古力娜扎, 夏提古丽, 夏提古丽]
    }
}
