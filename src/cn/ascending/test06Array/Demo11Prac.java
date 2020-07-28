package cn.ascending.test06Array;

import java.util.Arrays;

//https://www.youtube.com/watch?v=Gh0aiWWO1zs&list=PLD3Xyx6ef38yAdTNXD7ntDlaarf8NEoZ4&index=148
public class Demo11Prac {
    public static void main(String[] args) {
        //定义随机字符串
        String line="asdoaijaasabfhtifvnfanfianfa";
        //转换为字符数组
        char[] chars=line.toCharArray();
        //升序排序
        Arrays.sort(chars);
        //返向遍历打印
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]+" ");
            if(i==0){
                System.out.print(chars[i]+" ");
            }
        }

    }
}
