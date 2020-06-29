package cn.ascending.test27Thread.threadStatus;

/*
*  Timed waiting
* */
public class Demo01Sleep {
    public static void main(String[] args) {
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);

            //每输出一次 程序等待一秒钟
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
