package com.gsunis.demo.text;

import java.io.Serializable;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/23 10:45
 */
public class Employee implements Serializable {

    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
