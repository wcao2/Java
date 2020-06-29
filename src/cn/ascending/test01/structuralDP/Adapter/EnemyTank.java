package cn.ascending.test01.structuralDP.Adapter;

import java.util.Random;

public class EnemyTank implements ArmyRobot {
    Random generate=new Random();

    @Override
    public void fireWeapon() {
        int damage=generate.nextInt(10)+1;//[0,9) ==> [1,10)
        System.out.println("Enemy Tank does "+damage+" damage");
    }

    @Override
    public void driveForward() {
        int movement=generate.nextInt(5)+1;
        System.out.println("Enemy tanks moves "+movement+" spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName+" is driving the tank");
    }
}
