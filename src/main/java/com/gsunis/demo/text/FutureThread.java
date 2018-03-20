package com.gsunis.demo.text;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/3/5 21:44
 */
public class FutureThread implements Callable<Integer> {

// 执行函数
public Integer call() throws Exception {
        System.out.println("开始执行");
        return new Random().nextInt(100);
    }
}