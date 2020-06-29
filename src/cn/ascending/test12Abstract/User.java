package cn.ascending.test12Abstract;

public class User {
    private String name;
    private int money;//余额　当前用户的钱数

    //展示一下当前用户多少钱
    public void show(){
        System.out.println("my name is "+name+" , I have the amount of "+money+" $");
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
