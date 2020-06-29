package cn.ascending.test06Array;

public class Demo09ArrReturn {
    public static void main(String[] args) {
        //the method could have one or many parameters but only can have 0 or 1 return value
        //if there are several return value, must use array as a return type
        int[] result=calu(10,20,30);
        System.out.println("main方法接收到的返回值数组是： "+result);
        System.out.println("the total sum is "+result[0]);
        System.out.println("the average is "+result[1]);
    }
    //any data type can be parameter type or return type;
    // if array as parameter, it is address value; if array as return value, it is also a address value
    public static int[] calu(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        /*  1:  dynamic
            int[] array=new int[2];
            array[0]=sum;
            array[1]=avg;
        */
        //2: static
        int[] array={sum,avg};
        System.out.println("方法内部数组是： "+array);
        return array;
    }
}
