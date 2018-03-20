package com.gsunis.demo.text;

import java.io.*;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/1/30 9:45
 */
public class fileStreamTest2 {

    public static void main(String[] args) throws IOException {

        File file=new File("e:/demo/a.txt");
        FileOutputStream fs=new FileOutputStream(file);

        OutputStreamWriter writer =new OutputStreamWriter(fs,"utf-8");
        //写到缓冲区
        writer.append("中文输入");
        //换行
        writer.append("\r\n");

        writer.append("English");
        //关闭写入流
        writer.close();
        //关闭输出流
        fs.close();

        //创建输入流
        FileInputStream is=new FileInputStream("e:/demo/a.txt");
        //创建读取流
        InputStreamReader reader=new InputStreamReader(is,"utf-8");

        StringBuffer sb=new StringBuffer();
        while (reader.ready()){
            // 转成char加到StringBuffer对象中
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        //关闭读出流
        reader.close();
        //关闭输入流，释放资源
        is.close();
    }
}
