package cn.ascending.test28Reflection.ryo.cls;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//这个相当于JPA的Annotation

//define annotation interface
@Retention(RetentionPolicy.RUNTIME)//不写默认runtime
//告诉我们这个annotation是在Field上面(field declaration) Method上面(method declaration) PARAMETER(parameter declaration) TYPE在class上面
//在spring里 大多数都是TYPE 因为要创造class annotation
@Target(ElementType.TYPE)
public @interface AnnotationExample {//first time to create your own annotation
    public String name();
    public String value();
}



/*
//JPA 是interface, Hibernate is one of the JPA implementation.
//hibernate defines if I get the annotation, what I do; get the @Table and the name's value, then go to the db to validate, db has that table, continuous,no error
//hibernate wrote some code relates to the annotation(@table); in here, I just print out based on the AnnotationExample
//Table is JPA's annotation(like AnnotationExample in here), name is a variable in this class(like public String name() in here)
@Table(name="department")
public class Department(){}
*/