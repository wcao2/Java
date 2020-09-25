package cn.ascending.test02;

//if a variable use static key word, therefore that variable don't belong to object itself, it belong to the class
public class StaticExample {
    public static void main(String[] args) {
        Student st1=new Student("郭靖",19);
        Student st2=new Student("黄蓉",18);
        Student.room="101classroom";
        System.out.println("name "+st1.getName()+" age: "+st1.getAge()+" "+st1.room+" ,sNo is "+st1.getId());
        System.out.println("name "+st2.getName()+" age: "+st2.getAge()+" "+st2.room+" ,sNo is "+st2.getId());
    }
}

class Student{
    private int id;
    private String name;
    private int age;
    //when create new obj, counter++
    private static int counter=0;
    //static String room="101classroom";;
    static String room;

    //when use constructor to create object, counter++
    //then set the counter to id
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.id=++counter;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
