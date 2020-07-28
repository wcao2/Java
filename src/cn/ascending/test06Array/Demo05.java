package cn.ascending.test06Array;

public class Demo05 {
    public static void main(String[] args) {
        int[] array=new int[3];//dynamic initialization
        int[] arrayB={10,20,30};//static initialization
        System.out.println(arrayB.length);

        //create to array
        int[] arrayC=new int[3];
        System.out.println(arrayC.length);//3
        arrayC=new int[5];
        System.out.println(arrayC.length);//5
    }
}
