package cn.ascending.test24Map;

import java.util.HashMap;
import java.util.Scanner;

/*
*  count the number of every character
*  1;使用scanner获取用户输入的一个字符串
*  2: String类的方法toCharArray,把字符串转换为一个字符数组 遍历数组
*  3: String类的方法 length()+charAt(索引)
*  4a: 使用map集合中的containsKey(获取到的字符),
*    =>返回的是boolean true:字符存在 通过key获取value+1;false: 字符作为key,1作为value
*  4b: 使用map集合的get(key),返回null，key不存在,map.put(key,1);不是null,key存在
*  5:遍历map集合 输出结果
* */
public class Demo07MapTest {
    public static void main(String[] args) {
        //1:使用scanner获取用户输入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("please input string: ");
        String str=sc.next();
        //2:创建map集合 key是字符串的字符 value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        //3:遍历字符串 获取每一个字符
        for(char c:str.toCharArray()){
            //4:
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        //5:
        for(Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"===>"+value);

        }
    }

}
