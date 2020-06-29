package cn.ascending.test17Interface;

public class Main {
    public static void main(String[] args) {
        //创建英雄角色
        Hero h= new Hero();
        h.setAge(20);
        h.setName("盖伦");

        Weapon w=new Weapon("多兰剑");
        h.setWeapon(w);
        h.attack();
    }
}
