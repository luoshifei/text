package com.gsunis.demo.text;

import java.io.File;

/**
 * @author lsf
 * @Package com.gsunis.demo.text
 * @Description（TODO） 读取目录
 * @data 2018/1/30 10:18
 */
public class DirList {
    public static void main(String[] args) {
        String dirName="e:/demo";
        File file=new File(dirName);
        if(file.isDirectory()){
            System.out.println("目录："+dirName);
            String s[]= file.list();
            for (int i=0;i<s.length;i++){
                File f=new File(dirName+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i]+"是一个目录");
                }else {
                    System.out.println(s[i]+"是一个文件");
                }
            }
        }else {
            System.out.println(dirName+"不是一个目录");
        }
    }
}
