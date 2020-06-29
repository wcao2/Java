package cn.ascending.test01.creationalDP;

/*
*  怎么创建多个对象的设计模式 创建对象是一个模式
*  例如sessionFactory用来创建session
* */
public class FactoryDP {
    private String color;
    private String size;
    private String cover;

    //public String getColor(){return this.color;}
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public static FactoryDP getInstance(String color, String size, String cover){//或者不要参数 写死
        FactoryDP dp=new FactoryDP();
        /*dp.setColor("black");
        dp.setSize("big");
        dp.setCover("fabric");*/
        dp.setColor(color);
        dp.setSize(size);
        dp.setCover(cover);
        return dp;
    }

    public static void main(String[] args) {
        //FactoryDP f=new FactoryDP("red",null,"123");
        FactoryDP instance = FactoryDP.getInstance("red", null, "fabric");//或者不要参数 写死
        FactoryDP instance1 = FactoryDP.getInstance("red", null, "fabric");//或者不要参数 写死
        System.out.println(instance==instance1);//false

        Boolean a = Boolean.valueOf("true");
        Boolean b = Boolean.valueOf("true");
        System.out.println(a==b);//true
    }
}


//比如 Calendar 有 static getInstance()的方法 这个是典型的factory design pattern; 并且这个方法还是个overload based on Javadoc
//再比如 wrapper class like Integer,Boolean's valueOf() method to create instance