package cn.ascending.test01.structuralDP.Adapter;

//Adapter :It acts as a bridge between two incompatible interfaces.
//adapter适配器 ==>ArmyRobotAdapter
public class RobotAdapter implements ArmyRobot {

    //take the adapter and store inside of it an NormaRobot
    //each time one of these method called, going to point to the correct version for the normal robot which is store in the constructor method
    NormalRobot theRobot;

    public RobotAdapter(NormalRobot newRobot){
        theRobot=newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}

//Adapter pattern is when we have a class(adaptee) from external library, we have to customize it to fit into my program
//一般来说 library给我们一个标准的interface(ArmyRobot) 我们需要把它转换成不同类型