package com.gsunis.demo.text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/23 10:44
 */
public class SerializeDemo {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="zhangsan";
        employee.address="LANZHOU";
        employee.SSN = 11122333;
        employee.number = 101;
        try {
            FileOutputStream fos=new FileOutputStream("d:/employee.ser");
            //类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含序列化和反序列化对象的方法。
            ObjectOutputStream outputStream=new ObjectOutputStream(fos);
            outputStream.writeObject(employee);
            outputStream.close();
            fos.close();
            System.out.printf("Serialized data is saved in d:/employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
