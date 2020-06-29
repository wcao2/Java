package cn.ascending.test17Interface.interfaceAsParam;

import java.util.ArrayList;
import java.util.List;

public interface DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称 右边是实现类名称
        List<String> list=new ArrayList<>();
        List<String> result=addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("A");
        list.add("B");
        list.add("C");
        return list;
    }
}
