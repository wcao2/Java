package cn.ascending.test32Recursive;

//call the method inside itself
public class Demo02Recfactorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n){
        //base case: when to stop
        if(n==1){
            return 1;
        }
        //eventually it will get down to the base case
        return n* factorial(n-1);
    }
}
