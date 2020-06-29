package cn.ascending.test01.creationalDP;

import cn.ascending.utils.Computer;
import cn.ascending.utils.Pc;
import cn.ascending.utils.Server;
/*
*  create object based on the same pattern
* */

public class ComputerFactoryDp {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new Pc(ram,hdd,cpu);
        else if("SERVER".equalsIgnoreCase(type)) return new Server(ram,hdd,cpu);
        return null;
    }

    public static void main(String[] args) {
        Integer x=Integer.valueOf(8);
        Double y=Double.valueOf(5);
        Float z=Float.valueOf("80");
        System.out.println("the value of x is "+x+" and the value of y is "+y+" and the value of z is "+z);
    }
}


/*
*  java.util.Calendar use Factory dp.
*  getInstance() is a factory method,  use factory desgin pattern to create object
*
*  value of
* */