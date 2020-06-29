package cn.ascending.test06Array;

//计算-10.9到5.9之间，绝对值大于６或者小于2.1的整数有多少个
public class Demo13MathPrac {
    public static void main(String[] args) {
        int count=0;
        double min=-10.8;
        double max=5.9;
        for(int i=(int)min; i<max; i++){//强制抹去小数部分 or Math.ceil(min)
            int abs=Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("the total number is: "+count);
    }
}
