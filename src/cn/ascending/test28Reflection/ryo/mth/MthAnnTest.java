package cn.ascending.test28Reflection.ryo.mth;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MthAnnTest {
    public static void main(String[] args) {
        //create a class object for MethodReflection
        Class<MethodReflection> mf=MethodReflection.class;
        Method[] methods = mf.getMethods();
        Method method=null;
        for(Method m: methods){
            if(m.getName().equals("doSth")){
                method=m;
            }
        }
        AnnotationMethod annotation=method.getAnnotation(AnnotationMethod.class);//interface
        System.out.println("Annotation for method is ====>"+ method.getName());
        System.out.println("name attribute of Annotation: "+annotation.name());
        System.out.println("name attribute of Annotation: "+annotation.value());
    }
}
