package cn.ascending.test22WrapperClass;

//基本类型和字符串之间的相互转换
// 基本类型->字符串(String)  1:基本类型+""  2:包装类的静态方法toString(参数) 不是Object类的toString()方法 3: static String.valueOf(参数)
// 字符串->基本类型 使用包装类的静态方法 Integer类: static int parseInt(String s) Double类: static double parseDouble(String s)
public class Demo03BasicTypeWithStr {
    public static void main(String[] args) {
        //基本类型-->字符串
        //1
        int i1=100;
        String s1=i1+"";
        System.out.println(s1+200);//100200
        //2
        String str2=Integer.toString(100);
        System.out.println(str2+200);//100200
        //3
        String str3=String.valueOf(100);
        System.out.println(str3+200);//100200

        //字符串-->基本类型
        int i=Integer.parseInt(s1);
        System.out.println(i+1);//101
    }
}
