package com.gsunis.demo.text;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/3/1 21:50
 */


public class Demo {

    static StringBuffer sql = null;
    static DBHelper db1 = null;
    static ResultSet ret = null;

    public static void main(String[] args) {
        sql.append("select CASH_RECEIVABLE,QUOTATICKET_RECEIVABLE,POS_RECEIVABLE,NETPAY_RECEIVABLE\n" +
                "FROM T_RPT_OPERATION_EXIT ");//SQL语句
        db1 = new DBHelper(sql.toString(),"10.62.0.115");//创建DBHelper对象

        try {
            ret = db1.pst.executeQuery();//执行语句，得到结果集
            while (ret.next()) {
                //现金
                Long cash_receivable = ret.getLong(1);
                //定额票
                Long quotaticket_receivable = ret.getLong(2);
                //电子缴费
                Long pos_receivable = ret.getLong(3);
                //移动支付
                Long netpay_receivable = ret.getLong(4);
                System.out.println("站数据：现金"+cash_receivable+"定额票："+quotaticket_receivable+"电子缴费："+pos_receivable+"移动支付："+netpay_receivable);
            }//显示数据
            ret.close();
            db1.close();//关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
