package cn.ascending.test06Array;

//primitive data type, actual are locations(allocation);but in case of objects, memory allocation is similar to Arraylist
public class Demo02 {
    public static void main(String[] args) {
        int[] array={10,20,30};
        //the result is array address's hash value
        System.out.println(array);
        System.out.println(array[0]);
        int num=array[1];
        System.out.println(num);

        int[] array1=new int[3];
        System.out.println("test...."+array1[0]);//0
        System.out.println("test...."+array1[1]);//0
        System.out.println("test...."+array1[2]);//0
        System.out.println("=====================");
        array[1]=123;

    }
}
