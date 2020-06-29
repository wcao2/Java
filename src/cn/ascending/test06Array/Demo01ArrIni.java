package cn.ascending.test06Array;

//start from 78 https://www.youtube.com/watch?v=45IQDdybzCI&list=PLD3Xyx6ef38yAdTNXD7ntDlaarf8NEoZ4&index=78
//1: array is a reference data type
//2: elements in one array should have same data type
//3: the length of array can not be change
public class Demo01ArrIni {
    //initialize the array
    //1: dynamic(assign the length of array)
    int[] arrayA=new int[300];
    String[] arrayB=new String[5];
    //2: static(pointed the content of array)  type[] name = new type[]{e1,e2,e3}  or type[] name = {e1,e2,e3} omit
    int[] arrayC=new int[]{5,4,3,2,1};
    String[] arrayD=new String[]{"Hello","World","Java"};
    int[] arrayE={10,20,30};//OMit format

    public static void main(String[] args) {
        //Initialization is divided into two steps(both static or dynamic)
        int[] arrayF;
        arrayF =new int[] {1,2,3};

        int[] arrayG;
        arrayG=new int[5];

        //omit format of static initialized, can not be divided into to part
       /* int[] arrayH;
        arrayH={1,2,3};*/
    }


}
