package cn.ascending.test01.demo02;

public class Demo02Operator {
    public static void main(String[] args) {
        //1:Arithmetic operator: + - * / %
//        System.out.println(20+30);
//        int a=5;int b=3;
//        System.out.println(a/b);
        //auto increment operator
        //Use alone, ++a, a++ no diff
        //mix use, to use the result ++a, if a++, use original value of a, then ++
        //const can not use ++ --

        //2:Assignment operator:= += -= *= /= %=
        //basic assign operation|| Compound assignment operator
        //const can not use ++ --

        //3:Comparison operator
        // == < > <= >= !=

        //4:logical operator
        //&&(combine two boolean variables), ||(combine two boolean variables), !

        //5:Unary operator ! ++ --
        // 6: Binary operator + =
        //  7:Ternary operator ? :

        //异或运算符  两个操作数的位中，相同则结果为0，不同则结果为1
        /*int a=1;int b=1;
        System.out.println(a^b);*/
        int []array={1,2,3,4,5,6,7,8,8,9,10};
        int temp=array[0];
        for(int i=1;i<array.length;i++){
            temp=temp^array[i];
        }




        //The && operator is similar to the & operator, but can make your code a bit more efficient.
        // Because both expressions compared by the & operator must be true for the entire expression to be true,
        // there’s no reason to evaluate the second expression if the first one returns false.
        // The & operator always evaluates both expressions. The && operator evaluates the second expression only if the first expression is true.
    }


}
