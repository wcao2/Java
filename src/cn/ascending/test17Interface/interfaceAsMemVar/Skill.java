package cn.ascending.test17Interface.interfaceAsMemVar;

public interface Skill {
    /*public abstract*/ void use();
}

class Solider{
    private String name;
    private Skill skill;//使用接口Skill作为成员变量类型


    //instance method
    public void attack(){
        System.out.println(name+" 正在准备开干 ");
        skill.use();//call 接口中的抽象方法
        System.out.println("释放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
