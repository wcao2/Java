package cn.ascending.test01.demo02;

import java.util.HashSet;

//https://blog.csdn.net/weixin_44034328/article/details/104149773
public class Demo04BitOperator {

    //1-1000这1000个数放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现一次。
    //a异或a等于0，a异或0等于a（101异或101等于0）例如，A ^ A ^ B ^ C ^ C等于B，因为A^A等于0，消除重复了
    public static int solution1(int[] arr){
        int x=0;
        for (int i = 1; i < 1000; i++) {
            x=x^i;
        }
        for(int i=0;i<arr.length;i++){
            x=x^arr[i];
        }
        return x;
    }

    //2: 新建了一个HashSet。使用 Set 不能添加重复的特点，如果找到重复的了就返回那个值。
    public static int solution2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            boolean add = set.add(arr[i]);
            if(!add){
                return arr[i];
            }
        }
        throw new IllegalArgumentException("there are no two same number in this array");
    }

    //3
    public static int solution3(int[] arr){
        int[] newArr=new int[1001];
        for (int i=0;i<arr.length;i++){
            //因为值的范围在 1-1000，所以用值来作为新数组的下标
            int value = arr[i];
            newArr[value]++;
        }
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i]==2){
                return i;
            }
        }
        throw new IllegalArgumentException("there are no two same number in this array");
    }

    //4 时间复杂度 O(n2)
    public static int solution4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                    //System.out.println(i+" X "+j+" --> "+i*j);
                }
            }
        }
        throw new IllegalArgumentException("数组中没有两个相同的数！");
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        System.out.println(solution4(arr));
    }
}
