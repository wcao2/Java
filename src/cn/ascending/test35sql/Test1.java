package cn.ascending.test35sql;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        marryMe();
    }
    public static void marryMe(){
        Scanner sc=new Scanner(System.in);
        System.out.println("would you marry me...");
        String next = sc.next();
        if(next.equals("yes")){
            System.out.println("we will have a great life");
        }else{
            System.out.println("Go to the hell");
        }
    }
}
