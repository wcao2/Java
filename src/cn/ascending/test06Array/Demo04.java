package cn.ascending.test06Array;

public class Demo04 {
    public static void main(String[] args) {
        //所有引用类型变量，默认值是null
        //array 必须new才能使用其中元素，如果只给赋值null,没有进行new创建，会发生空指针异常(NullPointerException)
        int[] array=null;
        array=new int[3];

        System.out.println(array[0]);



    }
}
