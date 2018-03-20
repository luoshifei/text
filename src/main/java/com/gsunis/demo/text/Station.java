package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/26 16:43
 */
public class Station extends Thread {


    public Station(String name){
        this.setName(name);
    }
    //为了保持票数一致，票数要为静态
    static int tick=30;

    //创建一个静态钥匙,值是任意的
    static Object ob="ys";

    //重写run方法，处理买票的方法
    @Override
    public void run() {
        while (tick>0){
            synchronized (ob){//这个特别重要，必须使用一个锁
                //进去的人把钥匙拿在手上，出来的时候把钥匙让出来
                if(tick>0){
                    System.out.println(getName()+"卖出来第"+tick+"张票！");
                    tick--;
                }else {
                    System.out.println("票买完了！");
                }

            }try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
