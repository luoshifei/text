package com.gsunis.demo.text;

/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/2/23 9:59
 */
public class GenericMethodTest {

    public static <E> void printArray(E[] intArrray){

        //输出数组元素
        for ( E element : intArrray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 5, 4, 3, 2, 1 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }
}
