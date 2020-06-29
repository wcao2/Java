package cn.ascending.test01.structuralDP.composite;

/*
*  Composite Pattern helps you batch process action without duplicated the code
*  eg:如果要对所有员工进行操作 可以考虑这个
* */
//Base component
//1
public interface Shape {
    public void draw(String fillColor) throws NoSuchFieldException, IllegalAccessException;
}
