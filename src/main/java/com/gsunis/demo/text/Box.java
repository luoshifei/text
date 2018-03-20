package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/23 10:17
 */
public class Box<T> {

    private T t;

    public void  add(T t){
        this.t=t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox=new Box<Integer>();
        Box<String> stringBox=new Box<String>();
        integerBox.add(10);
        stringBox.add("菜鸟教程");
        System.out.println(integerBox.getT());
    }
}
