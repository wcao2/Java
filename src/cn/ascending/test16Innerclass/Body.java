package cn.ascending.test16Innerclass;

public class  Body {
    //外部类instance varibale
    private String name;

    //instance inner class
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("my name is+ "+name);//内用外 随意
        }
    }


    //instance method
    public void method(){
        System.out.println("外部类方法");
        /*Heart h=new Heart();
        h.beat();*/
        //Anonymous object(only use once) 调用内部类方法
        new Heart().beat();//外用内 需要内部类对象
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
