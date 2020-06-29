package cn.ascending.test03;

//矩形打印
public class Recprint {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){//the number of rows
            //hot key 5.fori
            for (int j = 0; j < 20; j++) {//the number of asterisk of each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
