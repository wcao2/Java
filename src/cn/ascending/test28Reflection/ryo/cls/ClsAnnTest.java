package cn.ascending.test28Reflection.ryo.cls;


public class ClsAnnTest {
    //这个应当于hibernate的implementation
    public static void main(String[] args) {
        Class<ClassReflection> cls = ClassReflection.class;
        //去class拿出相关的annotation
        AnnotationExample annotation = cls.getAnnotation(AnnotationExample.class);
       /* System.out.println("name: "+annotation.name());
        System.out.println("value: "+annotation.value());*/
        //如何知道父类引用的对象 本来是什么子类？
        //对象 instanceof 类名称 结果是布尔值 判断前面的对象能不能当做后面对象实例
        // (Determine whether the object in front can be used as an instance of the object behind)
        if(annotation instanceof AnnotationExample){
            AnnotationExample myAnnonation=(AnnotationExample)annotation;//down casting
            System.out.println("name: "+myAnnonation.name());
            System.out.println("value: "+myAnnonation.value());
        }

        /*if(animal instanceof Cat){
            //向下转型 进行还原动作 down casting
            //子类名称 对象名=(子类名称) 父类对象 =>将父类对象 还原成为本来的子类对象
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }*/
    }
}
