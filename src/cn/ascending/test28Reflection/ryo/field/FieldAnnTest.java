package cn.ascending.test28Reflection.ryo.field;


import cn.ascending.test28Reflection.ryo.cls.AnnotationExample;
import cn.ascending.test28Reflection.ryo.cls.ClassReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldAnnTest {
    public static void main(String[] args) {
        //first get the specific field with an annotation
        Class<FieldReflection> frc = FieldReflection.class;
        Field[] fields = frc.getFields();
        Field field=null;
        for(Field f:fields){
            if(f.getName().equals("myField")){
                field=f;
            }
        }
        //拿到指定field的annotation
        Annotation a1 = field.getAnnotation(AnnotationField.class);//interface
        //instanceof是Java的一个二元操作符（运算符）,也是Java的保留关键字。 它的作用是判断其左边对象是否为其右边类的实例，返回的是boolean类型的数据。
        if(a1 instanceof  AnnotationField){
            AnnotationField myAnn=(AnnotationField) a1;//Coercion   down casting
            System.out.println(myAnn.name());
            System.out.println(myAnn.value());
        }
        System.out.println(field.getName());
    }

}
