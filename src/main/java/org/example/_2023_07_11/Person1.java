//package org.example._2023_07_11;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.ToString;
//
//import java.io.*;
//
//@Getter
//@ToString
//@AllArgsConstructor
//public class Person1 implements Serializable{
//   private String name;
//   private int age;
//   private transient double salary;
//}
//
//class Serial1 {
//    public static void main(String[] args) {
//        Person1 person1 = new Person1("John", 45, 450000);
//
//        try {
//            FileOutputStream fileOut = new FileOutputStream("person.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(person1);
//            out.close();
//            fileOut.close();
//            System.out.println("-----------------------------------------------");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        person1 = null;
//        System.out.println(person1);
//
//        try {
//            FileInputStream fileIn = new FileInputStream("person.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            person1 = (Person1) in.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        if(person1 != null) {
//            System.out.println("Name: " + person1.getName());
//            System.out.println("Age: " + person1.getAge());
//            System.out.println("Salary: " + person1.getSalary());
//        }
//    }
//}