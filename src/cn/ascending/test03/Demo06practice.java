package cn.ascending.test03;

public class Demo06practice {
    //Find the sum of one to one hundred
    public static void main(String[] args) {
        System.out.println("结果是: "+getSum());
    }
    //1:return type:int 2:method name:getSum() 3:parameter list:null
    public static int getSum(){
        int sum=0;
        for (int i = 1; i <=100; i++) {
            sum+=i;
        }
        return sum;
    }
}
