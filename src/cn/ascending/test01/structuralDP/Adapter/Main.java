package cn.ascending.test01.structuralDP.Adapter;

public class Main {


    public static void main(String[] args) {
        EnemyTank et=new EnemyTank();
        NormalRobot nr=new NormalRobot();
        ArmyRobot ar=new RobotAdapter(nr);

        System.out.println("==================== enemy tank");
        et.fireWeapon();
        et.driveForward();
        et.assignDriver("wei");

        System.out.println("==================== ememy robot");
        nr.smashWithHands();
        nr.walkForward();
        nr.reactToHuman("wei");

        System.out.println("==================== with adapter");
        //方法名称依旧 但是方法体已经改变 用的是normal的方法体
        ar.fireWeapon();
        ar.driveForward();
        ar.assignDriver("wei");

    }
}
