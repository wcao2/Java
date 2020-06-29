package cn.ascending.test03;

public class Demo05practice {
    //define a method to justify they are same or not
    //therefore: 1:return type:boolean 2: method name: isSame 3: parameter list: int a int b
    public static boolean isSame(int a,int b){
        boolean same;
          //1:
//        if(a==b){
//            same=true;
//        }else{
//            same=false;
//        }
          //2:
//        same= a==b?true:false;
          //3:
          same=a==b;
          //4:
         //return a==b;
        return same;
    }

    public static void main(String[] args) {
        System.out.println(isSame(10,20));
    }
}
