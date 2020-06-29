package cn.ascending.test01.structuralDP.Adapter;

import java.util.Random;

/*
*  this is adaptee(适应者)-->enemy Robot
* */
public class NormalRobot {
    Random generate=new Random();

    public void smashWithHands(){
        int damage=generate.nextInt(10)+1;
        System.out.println("Enemy robot does "+damage+" with its hand");
    }

    public void walkForward(){
        int movement=generate.nextInt(5)+1;
        System.out.println("Enemy robot walks forward "+movement+" spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy robot male a smile to "+driverName);
    }
}
