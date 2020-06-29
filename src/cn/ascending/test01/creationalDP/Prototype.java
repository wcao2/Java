package cn.ascending.test01.creationalDP;

public class Prototype {
    /*
    *   把上一个bean拿出来 对他进行clone 并且修改需要修改的参数
    *   it is a creation process to save computing cost than using normal constructor in order to 提高创建对象的performance 比如我们创建几百个对象
    * */

    /*
    *   Emloyees ems=new Employees();
    *   ems.loadData();  ===>3 min

    *   List<String> copyList=ems.getEmplist() ===> copy(为了第二创建不再load Data)(copy不好 指向同一个memory address)
    *   Empployees emps2=new Employees(copyList);

    *   Employees ems2=ems.clone();//deep copy stack and heap both copy the new one
    *   Empployees ems2=new Employees(copyList);
    * */

    /*
    *  public class Employees implements Cloneable{
    *       private List<Wallet> empList;
    *       //第一个构造函数 空参数
    *       public Employees(){
    *           empList=new ArrayList<String>;
    *       }
    *       //第二个构造函数 参数为从第一个得到的list
    *       public Employees(List<Wallet> list){
    *           this.empList=list;
    *       }
    *       public void loadData(){
    *           empList.add(new Wallet("a"));
    *           empList.add(new Wallet("b"));//due to define empList above, it is a List and the List type is wallet
    *       }
    *
    *       public List<String> getEmpList(){
    *           return empList;
    *       }
    *  }
    *
    * */
}
