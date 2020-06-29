package cn.ascending.test29Annotaion.junior;


import cn.ascending.test29Annotaion.junior.MyAnno;
import cn.ascending.test29Annotaion.senior.MyAnno3;
import cn.ascending.utils.Person1;

/*方法名称=对应的值*/
@MyAnno(show = "abc",show2=1,per= Person1.P2,strs = {"a","b","c"})
@MyAnno3
public class Worker {

    @MyAnno3
    public String name="aaa";

    @MyAnno3
    public void show(){

    }
}
