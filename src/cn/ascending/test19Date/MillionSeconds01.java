package cn.ascending.test19Date;

/*
*  类Date表示特定的瞬间 精确到毫秒，毫秒值的作用 可以对时间和日期进行计算 把日期转换为毫秒 计算完毕 再把毫秒转换为日期
*  时间原点(0毫秒) 1970年1月1日 00:00:00 计算出当前日期到时间原点之间一共多少毫秒
*  毫秒转换为日期 1天=24*60*60=86400秒 * 1000= 86400000毫秒
* */
public class MillionSeconds01 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统一共到原点有多少毫秒
    }
}
