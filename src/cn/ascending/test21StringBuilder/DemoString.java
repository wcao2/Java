package cn.ascending.test21StringBuilder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
* String is immutable(不可变) object
*  q1: what is immutable object?:
*       create when you initialization, and cannot modify that after first creation but you can make a copy of it(generate new obj)
*       and change the copy as a new instance and you can not change the instance
*  q3: how do you create immutable obj?
*        use final key words on class level or use final in instance variable
*         immutable object do not have set method
*
*  String is immutable in Java, so it's easy to share it across different threads or functions
*  String pool: String pools helps in saving a lot of space for Java Runtime although it takes more time to create a String
*
*   dp(flyweight): almost equivalent to a map,every string value is a key in string pool, does not have any duplication, every time I want to create
*       a particular string, go to the String pool to check if the key already exists, if that exists I will reuse that value, if not, create a new object
*       and add that value to the String pool. Like add a new thing in map.
* */
public class DemoString {
    public static void main(String[] args) {
        //use any variable in lambda expression must be final
        List<Integer> anotherNums= Arrays.asList(1,2,3);
        int factor=2;
        Stream<Integer> str=anotherNums.stream().map(e->e*factor);
        str.forEach(System.out::print);//2,4,6
        //str.forEach(s-> System.out.println(s));


        final int[] factor1=new int[]{2};//dynamic initialized
        Stream<Integer> str1=anotherNums.stream().map(e->e*factor1[0]);
        factor1[0]=0;
        //only meet terminate operator( collect, forEach, reduce ,collect(return a result)), can execute line 30 36
        str1.forEach(System.out::print);//0,0,0   :: method reference
    }
}
