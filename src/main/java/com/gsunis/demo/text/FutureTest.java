package com.gsunis.demo.text;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/3/5 21:44
 */
public class FutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 创建线程池
        ExecutorService es = Executors.newCachedThreadPool();
        // 创建FutureThread实例
        FutureThread ft = new FutureThread();
        // 调用ExecutorService的 submit(Callable<T> task)方法，执行ft
        Future<Integer> f = es.submit(ft);
        // 关闭线程池
        es.shutdown();
        // 获取结果
        Integer result = f.get();
        // 判断结果
        if (result != null) {
            System.out.println("执行成功，结果为：" + result);
        } else {
            System.out.println("执行失败");
        }
    }
}
