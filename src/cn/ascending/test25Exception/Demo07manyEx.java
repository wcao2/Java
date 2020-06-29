package cn.ascending.test25Exception;

import java.lang.reflect.Array;

public class Demo07manyEx {
    public static void main(String[] args) {
        //多个异常 分别处理
        try {

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try{

        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("================================");
        //多个异常 一次处理 异常如果有字父类关系 子类必须写在上面
        try{

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
