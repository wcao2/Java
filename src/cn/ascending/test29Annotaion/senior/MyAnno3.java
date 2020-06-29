package cn.ascending.test29Annotaion.senior;

/*
*  @Target:描述注解能够作用的位置
    @Retention:描述注解被保留的阶段
    @Document:描述注解是否被抽取到api文档中
    @Inherited：描述注解是否被子类继承
* */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表示MyAnno3注解只能作用于类上 成员变量上 方法上
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {

}
