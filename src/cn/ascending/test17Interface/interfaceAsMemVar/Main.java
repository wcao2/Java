package cn.ascending.test17Interface.interfaceAsMemVar;

public class Main {
    public static void main(String[] args) {
        Solider s=new Solider();
        s.setName("Trump");

        //1: s.setSkill(new SkillImpl());  使用单独定义的实现类

        //2:使用匿名内部类 省掉类的单独定义
        /*Skill skill=new Skill() {
            @Override
            public void use() {
                System.out.println("biu biu biu");
            }
        };
        s.setSkill(skill);*/
        //3:进一步简化 匿名对象+匿名内部类
        s.setSkill(new Skill(){
            @Override
            public void use(){
                System.out.println("cool cool cool");
            }
        });

        s.attack();
    }
}
