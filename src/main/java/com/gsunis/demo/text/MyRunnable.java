package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description (TODO) java 多线程 2、runnable 接口
 * @data 2018/2/26 13:54
 */

/**
 * 实现Runnable 接口必须实现重写Run 方法
 * 多线程的状态：1、创建：（new）准备好了一个多线程的对象
 *             2、就绪：（runnable） 调运了start方法，等待CPU的调度
 *             3、运行：（run） 执行run方法
 *             4、阻塞：（blocked） 可能将资源交给其它线程使用
 *             5、终止：（dead） 线程销毁
 */
public class MyRunnable implements Runnable {

    public MyRunnable(){
    }
    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }

}
class Text2{

    public static void main(String[] args) {
        System.out.println("主线程ID："+Thread.currentThread().getId());
        //如果要实现Runnable 接口来实现多线程的话，那只能将Runnable 作为Thread 类的参数
        MyRunnable runnable=new MyRunnable();

        Thread thread=new Thread(runnable);

        thread.start();
    }
}
