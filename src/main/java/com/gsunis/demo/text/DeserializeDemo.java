package com.gsunis.demo.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/23 11:00
 */
public class DeserializeDemo {

    public static void main(String[] args) {
        Employee employee=null;

        try {
            FileInputStream fis=new FileInputStream("d:/employee.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            employee=(Employee) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("SSN: " + employee.SSN);
        System.out.println("Number: " + employee.number);
    }
}
