package org.example._2023_07_11;

import lombok.Getter;
import lombok.ToString;

import java.io.*;

@Getter
@ToString
public class Pers implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private int qqage;

    public Pers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pers(String name, int age, int qqage) {
        this.name = name;
        this.age = age;
        this.qqage = qqage;
    }
}

class SER {
    public static void serializeObject(String fileName, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("!!!Serialized!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object deSerializeObject(String fileName) {
        Object obj;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = in.readObject();
            fileIn.close();
            in.close();
            System.out.println("!!!DESerialized!!!");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}

class SerialEx {
    public static void main(String[] args) {
        Pers pers = new Pers("John", 45);
        SER.serializeObject("obj.ser", pers);
    }
}

class DeSerialEx {
    public static void main(String[] args) {
        Pers pers = (Pers) SER.deSerializeObject("obj.ser");
        System.out.println(pers);
    }
}