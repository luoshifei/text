package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package com.gsunis.demo.text
 * @Description（TODO） java异常
 * @data 2018/1/29 13:44
 */
public class exeptionClass {

    public static void main(String[] args)  {


        int[] a=new int[2];
        try {
            System.out.println("...."+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("...."+e);
        }finally {
            System.out.println(">>>>"+a[0]);
        }

    }
}
