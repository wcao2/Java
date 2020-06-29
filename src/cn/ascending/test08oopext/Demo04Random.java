package cn.ascending.test08oopext;

import java.util.Random;

public class Demo04Random {

    public static void main(String[] args) {
        Random r=new Random();
        //int 所有范围(有正负数)
        int num=r.nextInt();
        System.out.println("随机数是: "+num);
        for (int i = 0; i < 10; i++) {
            //[0,10)
            int num1=r.nextInt(10);
            System.out.println(num1);
        }
        System.out.println("===========");
        //generate [1,n] based on int n
        int n=5;
        for (int i = 0; i < 5; i++) {
            int result=r.nextInt(n)+1;//本类范围是[0,n),+1后变成[1,n+1)=>[1,n]
            System.out.println(result);
        }

    }
}
