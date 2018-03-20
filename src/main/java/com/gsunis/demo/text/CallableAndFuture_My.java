package com.gsunis.demo.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/3/1 21:20
 */
public class CallableAndFuture_My {


    // 异步计算
    public static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            // System.out.println(Thread.currentThread().getName()+ " : executor!!!");
            Random random = new Random();
            int i = random.nextInt(10);
            System.out.println(Thread.currentThread().getName() + " : " + i);
            return i;
        }

    }
    public static void main(String[] args) {

        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //创建有多个返回值得任务
        List<Future<Integer>> results = new ArrayList<Future<Integer>>();
        for (int i = 0; i < 5; i++) {
            results.add(executorService.submit(new Task()));
        }
        System.out.println("main waiting!");
        int count=0;
        // 获取所有并发任务的运行结果
        for (Future<Integer> future : results) {
            try {
                count+=future.get();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("main complete : "+count);
        if (!executorService.isShutdown()) {
            executorService.shutdown();
        }

    }

}
