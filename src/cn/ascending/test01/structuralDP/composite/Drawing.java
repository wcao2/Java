package cn.ascending.test01.structuralDP.composite;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

//4 this is a composite object, (weicao: if we want to do same manipulation to every implementation of Shape, we can add this Drawing method)
public class Drawing implements Shape{
    @Override
    public void draw(String fillColor) throws NoSuchFieldException, IllegalAccessException {
        //collection of shapes
        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Rectangle());//Rectangle implements Shape so we can new Rectangle() in here
        shapes.add(new Triangle());

        for (Shape sh:shapes){
            /*if(sh instanceof Rectangle){
                sh.draw(fillColor);
                System.out.println("the rectangle is painted with red");
            }*/
            sh.draw(fillColor);  //if there are lots of code in here ==> Reduce code size
            //getClass() one of the method to get Class Object
            Field sha = sh.getClass().getField("shape");
            System.out.println(sha.get(sh)+" is "+fillColor);
        }
    }
}
