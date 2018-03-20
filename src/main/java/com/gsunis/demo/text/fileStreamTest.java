package com.gsunis.demo.text;

import java.io.*;

/**
 * @author lsf
 * @Package com.gsunis.demo.text
 * @Description (TODO) 文件操作类
 * @data 2018/1/30 9:27
 */
public class fileStreamTest {
    public static void main(String[] args) {
        try{
            byte a[]={1,3,5,7,9};
            OutputStream os=new FileOutputStream("e:/demo/text.txt");
            for (int i=0; i<a.length;i++){
                os.write(a[i]);
            }
            os.close();
            InputStream is=new FileInputStream("e:/demo/text.txt");
            int size=is.available();
            for (int x=0; x<size;x++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();

        }catch (IOException e){
            System.out.println("捕获的异常为："+e);
        }
    }
}
