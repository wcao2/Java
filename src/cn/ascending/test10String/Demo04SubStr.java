package cn.ascending.test10String;

public class Demo04SubStr {
    public static void main(String[] args) {
        String str1="HelloWorld";
        //overload
        //1:从参数位置一直到字符串末尾，并返回新的字符串
        String str2=str1.substring(5);//[5,final]
        System.out.println(str2);//World
        //2:beign start to end [begin,end)
        String str3=str1.substring(0,5);
        System.out.println(str3);//Hello

        String a="123";
        System.out.println(a.toString());//123

      /*  public String toString() {
            return this;
        }*/

    }
}
