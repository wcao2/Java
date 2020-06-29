package cn.ascending.test06Array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        System.out.println(arrayA);//address value
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println("=============");

        arrayA[1]=10;
        arrayA[2]=20;
        System.out.println(arrayA);//address value
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("=============");

        //int[] arrayB=new int[3];
        //将arrayA 数组的地址值,赋值给arrayB
        int[] arrayB=arrayA;
        System.out.println(arrayB);//address value
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//10
        System.out.println(arrayB[2]);//20
        System.out.println("=============");

        arrayB[0]=100;
        arrayB[1]=200;
        System.out.println(arrayB);//address value
        System.out.println(arrayB[0]);//100
        System.out.println(arrayB[1]);//200
        System.out.println(arrayB[2]);//20
        System.out.println("=============");
    }

}
