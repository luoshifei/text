package com.gsunis.demo.text;

import java.io.*;
import java.util.Scanner;

/**
 * @author lsf
 * @Package com.gsunis.demo.text
 * @Description （TODO）IO流之数据流与网络传输基础
 * @data 2018/2/1 10:02
 */
public class io {
    /**
     * 在我们的实际开发中经常要将String、Long等形式的数据进行网络传输，
     * 这就需要将这些String等形式的数据，转化为字节数组byte[]，
     * 再进行网络传输，传输后进行解码，还原成String等形式，要用到以下公式，理解不了可以当公式用。
     * @param args
     */
    public static void main(String[] args) throws IOException {

        long len=new Scanner(System.in).nextLong();
        //转化为字节数组的公式
        ByteArrayOutputStream byteArrOut=new ByteArrayOutputStream();
        DataOutputStream dataOut=new DataOutputStream(byteArrOut);
        dataOut.writeLong(len);

        byte[] bytes=byteArrOut.toByteArray();
        /************************************/
        byte[] bytesClone=bytes.clone();//模拟网络交换传输
        /************************************/
        //由字节数组解码还原
        ByteArrayInputStream byteArrIn=new ByteArrayInputStream(bytesClone);
        DataInputStream dataIn=new DataInputStream(byteArrIn);
        long lenClone;
        lenClone=dataIn.readLong();
        System.out.println(lenClone);
        //关闭流，释放资源
        byteArrIn.close();
        byteArrOut.close();
        dataIn.close();
        dataOut.close();

    }
}
