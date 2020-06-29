package cn.ascending.test06Array;

//93
//array reverse
public class Demo07Reverse {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        //traverse array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        for(int min=0,max=array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        System.out.println("============");
        //traverse array again
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
