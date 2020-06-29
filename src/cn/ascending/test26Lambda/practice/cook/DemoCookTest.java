package cn.ascending.test26Lambda.practice.cook;

public class DemoCookTest {

    public static void main(String[] args) {
        //调用invokeCook方法 传递cook接口的匿名内部类对象
        invokeCook(new DemoCook() {
            @Override
            public void makeFood() {
                System.out.println("恰饭了");
            }
        });

        //使用lambda expression 简化匿名内部类书写
         invokeCook(()->{
             System.out.println("lambda 恰饭了");
         });

         DemoCook dc=new DemoCook() {
             @Override
             public void makeFood() {
                 System.out.println("food is so declcious");
             }
         };
    }

    //定义个方法 参数传递cook接口 方法内部调用Cook接口中的makeFood()
    public static void invokeCook(DemoCook cook){
        cook.makeFood();
    }
}
