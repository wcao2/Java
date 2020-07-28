package cn.ascending.test34serialization;
// https://beginnersbook.com/2014/07/java-serialization/
//Serialization:Serialization is a mechanism to convert an memory object into stream of bytes
// so that it can be written into a file, transported through a network and stored into database(file,but structured).

//In simple words serialization is converting an object to stream of bytes and

// de-serialization is rebuilding the object from stream of bytes.

// For my project, jackson already done serialization; In here, Person need to do implements Serializable(interface)

import cn.ascending.utils.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// A class(Person) must implement java.io.Serializable interface to be eligible for serialization.
public class Serialize {
    public static void main(String[] args) {
        Person p1=new Person("WeiCao",12);
        try {
            FileOutputStream fos=new FileOutputStream("Person.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(p1); //writing an object of Person class to the Person.ser file.
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
