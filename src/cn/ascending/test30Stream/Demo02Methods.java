package cn.ascending.test30Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Intermediate Operations: map filter sorted limit skip concat
    Terminal Operations: collect, forEach, reduce,count

*  foreach方法 用来遍历流中的数据 是一个终结方法 遍历之后不能继续调用Stream中其他方法
*  count:用于统计Stream流中元素个数 返回值是一个long类型的整数

*  filter: 将一个流转换成另一个子集流
*  map:流中的元素映射到另外一个流中
*  limit:可以对流进行截取 只用前n个 返回新的流 还可以继续调用方法
*  skip:跳过前几个元素 使用skip方法获取一个截取之后的新流
*  concat:两个流合并成为一个新的流
* */
//Syntax of lambda expression : (parameter_list) -> {function_body}
//To use lambda expression, you need to either create your own functional interface or use the pre defined functional interface provided by Java.
// or use lambda expression to do manipulation on Collection, such as list
public class Demo02Methods {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream=Stream.of("张三","李四","王五","赵六","田鸡");
        //使用stream流中的方法
//        stream.forEach((String name)->{
//            System.out.println(name);
//        });
        stream.forEach(name-> System.out.println(name));
        System.out.println("==================================");
        //创建一个Stream流
        Stream<String> stream1=Stream.of("张三丰","张翠山","赵敏","周芷若","张无忌");
        //only want family name is zhang
        Stream<String> stream2=stream1.filter((String name)->{return name.startsWith("张");});
        //遍历stream2
        stream2.forEach(name-> System.out.println(name));
        System.out.println("==================================");
        //获取一个Stream流
        Stream<String> stream3=Stream.of("1","2","3","4","5");
        //使用map方法 把字符串型整数映射为Integer
        Stream<Integer> stream4=stream3.map((String s)->{
            return Integer.parseInt(s);
        });
        //stream3.map(s->Integer.parseInt(s));

        //遍历stream4
        stream4.forEach(i-> System.out.println(i));
        System.out.println("==================================Count");
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵薇");
        list.add("张强");
        list.add("张三丰");
        Stream<String> stream5 = list.stream();
        Long count=stream5.count();
        System.out.println(count);
        System.out.println("==================================Limit");
        String[] arr={"A","B","C","D"};

        Stream<String> stream6 = Stream.of(arr);
        Stream<String> stream7 = stream6.limit(3);
        stream7.forEach(name-> System.out.println(name));
        System.out.println("==================================Skip");
        String[] arr1={"A","B","C","D"};
        Stream<String> stream8=Stream.of(arr1);
        //使用skip方法跳过前三个元素
        Stream<String> stream9 = stream8.skip(3);
        stream9.forEach(name-> System.out.println(name));
        System.out.println("==================================concat");
        Stream<String> stream10=Stream.of("张三","李四","王五","赵六","田鸡");
        Stream<String> stream11=Stream.of("张三丰","张翠山","赵敏","周芷若","张无忌");
        //把以上两个流组合到一起
        Stream<String> cat=Stream.concat(stream10,stream11);
        cat.forEach(c-> System.out.println(c));
    }
}
