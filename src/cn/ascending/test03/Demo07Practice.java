package cn.ascending.test03;

public class Demo07Practice {
    //define a method, to print the specified times of helloworld
    public static void main(String[] args) {
        System.out.println(getMax(100,200));
        printCount(5);
    }

    public static void printCount(int number){
        for (int i = 0; i <=number; i++) {
            System.out.println("hello world "+i);
        }
    }

    //if a method donot have return type, could add return but do not have the rest before return
    //return in here mean do not have return value just finish the method
    public static void m2(){return;}

    //a method could have many return statement, but make sure only one can be executed
    public static int getMax(int a,int b){
//        int max;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        return max;
        if(a>b){
            return a;
        }
        return b;
    }

}
