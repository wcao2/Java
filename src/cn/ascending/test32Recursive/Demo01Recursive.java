package cn.ascending.test32Recursive;

/*
*  递归计算1～n之间的和
*  如果仅仅计算1～n之间的和 不推荐递归 仅仅for循环即可
* */
public class Demo01Recursive {
    public static void main(String[] args) {
        //main方法 push stack(入栈) 调用sum方法, sum入栈，sum会一直调sum方法 导致内存中有多个sum方法 效率低下
        int res=sum(3);
        System.out.println(res);
    }

    //1:递归结束条件:获取到1的时候结束 2:递归目的:获取到下一个被加的数字(n-1）
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        //获取到下一个被加的数字
        return n+sum(n-1);
    }
}
