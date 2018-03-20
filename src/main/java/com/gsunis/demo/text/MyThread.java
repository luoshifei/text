package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description (TODO) java 多线程 1、集成Thread 类
 * @data 2018/2/26 13:35
 */


/**
 * 继承Thread 类 必须重写run()方法
 */
public class MyThread extends Thread {

    private static int num=0;

    public MyThread(){
        num++;
    }

    @Override
    public void run() {
        System.out.println("主动创建的第+"+num+"个线程");
    }


}
class Text {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
    }
}
