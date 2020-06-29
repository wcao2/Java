package cn.ascending.test25Exception;

import java.util.Scanner;

/*
*  模拟注册操作 如果用户名存在 则抛出异常并且提示 该用户已经注册
*  1:使用数组 保存已注册过的用户名
*  2:使用scanner 获取用户输入注册的用户名
*  3: 定义一个方法 对用户输入的注册的用户名判断，遍历存储已经注册过用户名的数组 获取每一个用户名
*  4: 使用获取到的用户名和用户输入的用户名进行比较
*     true:已存在 throw RegisterException 告知用户 "亲 已被注册"
*     false:继续遍历比较 若循环结束还没有找到重复的用户名 提示 “恭喜 注册成功”
* */
public class Demo10SelfDefPrac {
    static String[] userNames={"A","B","C"};


    public static void main(String[] args)/*throws Demo09SelfDef*/ {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the name to register: ");
        String username=sc.next();
        checkUsername(username);
    }

    //define a method, to judge the input name
    public static void checkUsername(String username)/*throws Demo09SelfDef*/{
        //traverse array, get every username
        for(String name:userNames){
            //compare
            if(name.equals(username)){
                try{
                    throw new Demo09SelfDef("the username already be used");
                }catch (Demo09SelfDef e){
                    e.printStackTrace();//print exception info
                    return;//结束方法
                }
            }
        }
        System.out.println("success to register");
    }
}
