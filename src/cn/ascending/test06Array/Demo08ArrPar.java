package cn.ascending.test06Array;

public class Demo08ArrPar {
    public static void main(String[] args) {
        int[] array={1,2,3,2,1,14};
        printArray(array);//参数是数组的地址值
    }

    //only print,no calculate,no result, so void
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
