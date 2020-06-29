package cn.ascending.test29Annotaion.junior;

import cn.ascending.utils.Person1;

//注解本质上就是一个接口 该接口默认继承Annotation接口
//public interface MyAnno extends java.lang.annotation.Annotation{}
public @interface MyAnno {
     //自定义注解属性列表

      String show();
      int show2();
      //枚举
     Person1 per() ;
     String[] strs();
}
