##Java basic knowledge
It contains almsot all the basic knowledge of Java
* Java8
    *   default method in interface
    *   Lambda expression in interface
    *   Optional in interface(Optional类是一个可以为null的容器对象)
* test01: 
    * Creational Design Pattern  
        * build design pattern
        * factory design pattern(创建多个对象的设计模式)
        * prototype design pattern
        * singleton design pattern(eager, lazy)(怎么创建一个instance的设计模式)
    * Structural Design Pattern  
        * adapter design pattern
        * composite design pattern
        * flyweight
    * Data type(Type conversion(auto, Coercion))
    * Operator
    * Clone
* =======================================
* test02:
    * Data related
    * Static code block(execute it before  over non-static)
    * if a instance variable use static key word, 
      therefore that varaibale don't belong to object itself, it belong to the class
    * static variable and method belong to class  
* =======================================
* test03:
    * 3 ways how to call the methods
* =======================================
* test04:
    * basic data type:byte short int long float double char boolean
    * The most common place is the overload of the constructor.
* =======================================
* test05:
    * comparable接口  
* =======================================
* test06: Array
    * initialize an array
    ```
    int[] arrayA=new int[300];//dynamic(assign the length of array)
    int[] arrayC=new int[]{5,4,3,2,1};//static(pointed the content of array)
    ```
    * Convert Array to String, String to Char Array
* =======================================
* test07: OOP
    * explanation the diff of Process-oriented and Obj-oriented
    * Encapsulation, inherit, Polymorphism
    * class is a desc of things and it is abstract
    * objs are instances of a class, it is concrete
    * classes are templates of objs, and objs are entities of classes
    * Demo05: diff between local variable and member variable
* =======================================
* test08: OOP extended
    * Java Bean defined
    * Scanner practice
    * Anonymous: create anonymous object, anonymous parameter, anonymous return value
    * Random
    * garbage collection
    * java pass by value
* =======================================
* test09: ArrayList Introduce
    * iterate list
    * autoboxing by using wrapper class
    ```java
      Random r=new Random(); r.nextInt(33); //[0,32]
    ```
    * demo06 list as parameter
* =======================================
* test10: String
    * String pool
    * Methods: equals(), length(), concat(), charAt(),indexOf(),subString()
    ```java
      //String toString() 方法
      public String toString() {return this;}
    ```
    * convert String to char and byte char
    * split() to split a String
* =======================================
* test11: Extends
* =======================================
* test12: Abstract
* =======================================
* test13: Interface
    ```java
      //Member variable in interface
      [public] [static] [final] returnType　constName＝value;
      //Default method from JAVA8, implementation class can overwrite default method
      [public] default　returnType　methodName(paras){method body}
      //static method from JAVA8
      [public] static　returnType　methodName(paras){method body}
      //private method from JAVA9
      //private can only be used by Interface,cannot be used by implementation class
      private returnType methodName(paras) {method body}
      private static returnType methodName(paras) {method body}
      //如果实现类所实现的多个接口中:存在重复的抽象方法，那么只需要覆盖重写一次即可
      //如果实现类所实现的多个接口中:存在重复的默认方法 实现类一定要对冲突的默认方法进行重写
      //一个类如果直接父类中的方法和接口当中默认方法产生了冲突 优先使用父类当中的方法
    ```
* =======================================
* test14: Ploymorphism 
     *  父类名称 对象名=new 子类名称();
     *  接口名称 对象名=new 实现类名称();
     *  直接通过对象名称访问成员变量 看等号左边是谁 优先用谁 没有则向上找
     *  new的是谁 运行谁的成员方法
     *  间接通过成员方法访问成员变量 看该方法属于谁优先用谁的成员变量 没有则向上找
    ```java
      //sonObject upCasting to FatherObj, cannot use son's own methods
      FatherObj objName=new sonObject(); 
    ```
* =======================================
* test15: final keyword
* =======================================
* test16: Inner class
     * 匿名对象 在调用方法的时候 只能调用唯一一次 如果需要同一个对象调用多次方法 那么必须给对象起一个名字
     * 匿名内部类是省略了(实现类/子类名称); 匿名对象是省略了对象名称
     * 内用外 直接用; 外用内 需要创建内部类对象
     * 成员内部类 局部内部类
* =======================================
* test17: Interface as member variable and method parameter
* =======================================
* test18: equals
     * 比较两个对象的地址值 没有意义; 所以要重写equals方法 比较两个对象的属性
     * 怎么比较两个对象是否相等
* =======================================
* test19: Date
     * Calendar
     * Date & SimpleDateFormat
* =======================================
* test20: System
     * currentTimeMillis(){}  
     将数组中指定数据拷贝到另一个数组中
     * arraycopy(Object oriArr, int oriPos, Object aimArr, int aimPos, int length){}
* =======================================
* test21: String Builder
     * StringBuffer was the only choice for String manipulation till Java 1.4 but it has one disadvantage  
       that all of its public methods are synchronized. StringBuffer provides Thread safety but on a performance cost.
     * 可以提高字符串的操作效率 可以看成一个长度可变的字符串 底层是一个数组 没有被final修饰  
       初始长度是16  在内存中始终是一个数组 占用空间少 效率高 如果超出容量 会自动扩容
* =======================================
* test22: Wrapper Class
     * boxing, unboxing
     * Auto Boxing, Auto Unboxing
     ```java
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);//auto Boxing
       int a=list.get(0);//auto Unboxing  等于 list.get(0).intValue();
     ```
     * Conversion between primitive type and String
* =======================================
* test23: Collection
    * 集合一些公共方法 add remove contain size isEmpty toArray
    * Collections is tool class which is used to operate 集合
    ```java
         ArrayList<String> list=new ArrayList<>();
         Collections.addAll(list,"a","d");
         Collections.shuffle(list);//打乱顺序
         Collections.sort(list01);//再次排序 只能是List
         System.out.println(list);
    ```
    * Comparable is equivalent to the internal comparator. 
      The comparator is equivalent to an external comparator.
    * 数组和链表结构的比较
    * Generic Data Type
    * List Set HashSet TreeSet Hashcode
    * java.utils.collection接口,所有集合最顶层接口 定义所有集合共性方法
    * variable parameters(可变参数) 
* =======================================
* test24: Map
    *  TreeMap
    *  basic methods: put(), remove(), get(), containsKey()
    *  Traverse
    ```
        Set<Map.Entry<String, String>> set = map.entrySet();
        //遍历
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }
        System.out.println("==============");
        for(Map.Entry<String, String> entry:set){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }
        System.out.println("==============");
        //牛逼 就一行
        map.forEach((k,v)-> System.out.println(" key is: "+k+" ,value is: "+v));
  ```
* =======================================
* test25: Exception
    *   Exception: 编译期异常，进行编译java程序时出现的问题(可以解决)
    *   RuntimeException:运行期异常 java程序在运行的过程中发生的问题
    *   Error:错误(无法解决，必须修改源代码 程序才能继续执行)
    *   throws Exception(jvm solve the ex, stop the process, and print the ex in console)
    ```Java
      public class Demo02Ex {
          public static int getElement(int[] arr,int index){
              //1:访问了数组中的3索引，而数组中是没有的，jvm就会检测出程序出现异常
              //  jvm会根据异常产生的原因去创建异常对象(include 内容 原因 位置) new ArrayIndexOutOfBoundsException("3")
              //  在 getelement方法中没有处理异常的逻辑，那么jvm就会把异常对象抛出给方法的调用者main方法来处理异常
              int ele=arr[index];
              return ele;
          }
      
          public static void main(String[] args) {
              int[] arr={1,2,3};
              //2: main方法接收到了异常对象 main也没有异常的处理逻辑 继续把对象抛出给main方法的调用者jvm处理 jvm接收到了异常对象
              //jvm做了两个事儿: a:把异常对象内容 原因 位置以红色字体打印到控制台 b:jvm会终止当前正在执行的java程序
              int e=getElement(arr,3);
              System.out.println(e);
          }
      }
    ```
    *  缺点:throws异常代码后面的不会在被执行
    *  try catch:异常处理的第二种方式 自己处理异常 
    ```
    try{
          可能有异常的代码
      }catch(定义一个变量 用来接收try中抛出的异常对象){
          异常的处理逻辑 一般会记录在log中
      }
    ```
    *  1: try可能抛出多个异常对象 可以有多个catch来处理异常对象
    *  2: try中产生异常，就会执行catch中处理异常的逻辑， 在执行try catch之后的代码
    *  3: 如果try中没有产生异常，就不会执行catch中异常处理的逻辑 执行try中 继续执行try catch之后的代码
* =======================================
* test26: Lambda expression
    * Anonymous inner class to implements Thread with lambda expression
    * FunctionalInterface with Lambda expression
    * Collection with Lambda expression
* =======================================
* test27: Thread
    * How to create a Thread(two ways)  
    1: class继承Thread;重写run方法;创建Thread类的子类对象;子类对象调用start方法  
    2：创建runnable接口的实现类;实现类重写run方法;创建runnable接口实现类对象;创建Thread对象 构造方法中传递Runnable接口的实现类对象;调用Thread类中的start方法，开启新的线程执行run方法  
    实现runnable好处:
    1:避免单继承局限性 继承Thread类就不能继承其它的类
    2:runnable接口方式把设置线程任务和开启新线程进行分离(解耦) 实现类中 重写run方法用来设置线程任务 ;创建Thread对象 调用start()方法 用来开启新线程  
    3: Anonymous class to implement Thread
    *  How to get Current Thread && Thread name
    *  set the Thread name(two ways)
    *  sleep 方法 使当前正在执行的线程以指定的毫秒数暂停
    *  Thread Security problem(1:Synchronous Code Block 2:Synchronous method 3:lock锁)
    *  wait and notify(must be called by the same lock object)
    *  Thread join and priority
* =======================================
* test28: Reflection
    * three ways to get Class object
    ```
        Class cls1= Class.forName("cn.ascending.utils.Person");
        Class cls2= Person.class;
        Person p=new Person();
        Class cls3=p.getClass();
    ```
    * get the array member variable, constructors, methods
* =======================================
* test30: Stream
    * Use for loop to traverse List
    * Change List, Map, Array to Stream
    * Intermediate and Terminal Operations
        * Termianal: foreach count
        * Intermediate: filter map limit skip concat
        