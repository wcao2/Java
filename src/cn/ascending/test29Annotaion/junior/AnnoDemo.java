package cn.ascending.test29Annotaion.junior;

/*
*
* */
//压制关于class所有警告
@SuppressWarnings("all")
public class AnnoDemo {

    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
    }


}
