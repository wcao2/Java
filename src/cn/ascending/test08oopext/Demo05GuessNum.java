package cn.ascending.test08oopext;

import java.util.Random;
import java.util.Scanner;

/*
*  1: generate random number and do not change， use random.nextInt()
*  2: 需要键盘输入
*  3：获取键盘输入的数字,用Scanner的nextInt()
*  4: 已经得到的两个数字，判断一下，给出提示
*  5: retry就是再来一次，循环次数不确定， 用while(true)
* */
public class Demo05GuessNum {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;//[0,100) [1,100]
        Scanner sc=new Scanner(System.in);

        //无限猜
        while (true){
            System.out.println("please type what you want...");
            int guessNum=sc.nextInt();
            if(num<guessNum){
                System.out.println("to big, try again...");
            }else if(num>guessNum){
                System.out.println("to small, try again...");
            }else {
                System.out.println("successful...");
                break;//stop the cycle(for, while)
            }
        }
        System.out.println("game over");
    }
}
