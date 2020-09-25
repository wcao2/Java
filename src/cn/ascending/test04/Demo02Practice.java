package cn.ascending.test04;

public class Demo02Practice {
    public static void main(String[] args) {
        byte a=10;
        byte b=12;
        System.out.println(isSame(a,b));//false
        System.out.println(isSame((short)10,(short)20));//false
        System.out.println(isSame(10L,10L));//true
    }

    public static boolean isSame(byte a,byte b){
        boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean isSame(int a,int b){
        return a==b;
    }
    public static boolean isSame(long a,long b){
        if(a==b){
            return true;
        }
        return false;
    }
}
