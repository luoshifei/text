package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/26 17:00
 */
public class TextThread {

    /**
     * java 多线程同步锁的使用
     */
    public static void main(String[] args) {
        Station station=new Station("第一窗口");
        Station station2=new Station("第二窗口");
        Station station3=new Station("第三窗口");

        station.start();
        station2.start();
        station3.start();
    }
}
