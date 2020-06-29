package cn.ascending.test34serialization;

import cn.ascending.utils.Person;

import java.io.*;

//This class would rebuilt the object of Person class after reading the stream of bytes from the file.
public class Deserialize {
    public static void main(String[] args) {
        Person p=null;

        try {
            FileInputStream fis = new FileInputStream("Person.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            p = (Person)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }   catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
