package cn.ascending.test01.Entrypt;

public class Entrypt {

    public static void main(String[] args) {
        //convert the String to a Character array to make it easier to work with, so we can alter each individual character
        String text="Hey, how's going?";
        char[] chars=text.toCharArray();
        System.out.println(text);

        int key=1;

        for (char c:chars){
            c+=key;
            System.out.print(c);
        }
    }
}
