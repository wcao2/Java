package cn.ascending.test06Array;

//Traversing the array is to process the elements in the array one by one. The default method is to print the output.
public class Demo06Traverse {
    public static void main(String[] args) {
        int[] array={14,25,39,2,3,45};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //get the max value from the array
        int[] array1={5,15,25,39,1999};
        int max=array1[0];
        for (int i = 1; i < array1.length; i++) {
            if(array1[i]>max){
                max=array1[i];
            }
        }
        System.out.println("the max value is "+max);
    }
}
