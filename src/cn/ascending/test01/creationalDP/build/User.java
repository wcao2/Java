package cn.ascending.test01.creationalDP.build;

public class User {
    //all the attributes have final modifier, cannot be change, only have get method
    private final String name;
    private final int age;
    private final String phone;
    private final String address;

    //this constructor is private, so can not use this method outside the class to create User obj
    private User(UserBuilder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.phone=builder.phone;
        this.address=builder.address;
    }

    //Inner class
    public static class UserBuilder {
        private String name;
        private int age;
        private String phone;
        private String address;

        //内部类构造方法只接受一定要的的参数(The inner class constructor only accepts certain parameters)
        //一定需要有的
        public UserBuilder(String name) {
            this.name = name;
        }

        //可以customization
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //由于Builder是非线程安全的，所以如果要在Builder内部类中检查一个参数的合法性，必需要在对象创建完成之后再检查
        //So if you want to check the legality of a parameter, you must check it after the object is created.
        public User build() {
            //return new User(this);
            User user=new User(this);
            if(user.getAge()<18){ throw new IllegalStateException("Age out of range");}
            return user;
        }
    }
    //对外只提供get方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

}
