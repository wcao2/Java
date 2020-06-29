package cn.ascending.test01.Entrypt;

//alex
public class Decrypt {
    public static void main(String[] args) {
        int key=1;
        String msg="Ifz-!ipx(t!hpjoh@";
        char[] chars=msg.toCharArray();
        System.out.println(chars);

        for(char c:chars){
            c-=key;
            System.out.print(c);
        }
    }
}
