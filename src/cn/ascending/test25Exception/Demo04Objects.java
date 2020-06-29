package cn.ascending.test25Exception;

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
        //对传递过来的参数进行合法性判断 是否为空  这儿 最后抛给jvm处理(I guess)
//        if(obj==null){
//            throw new NullPointerException("the obj is null");
//        }
        //Objects.requireNonNull(obj);//same as above
        Objects.requireNonNull(obj,"the passed obj is null");//same as above
    }
}
