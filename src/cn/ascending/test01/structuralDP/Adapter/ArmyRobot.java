package cn.ascending.test01.structuralDP.Adapter;

//target  ArmyAttacker
public interface ArmyRobot {
    public abstract void fireWeapon();
    abstract void driveForward();
    void assignDriver(String driverName);
}
