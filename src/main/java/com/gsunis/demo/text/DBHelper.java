package com.gsunis.demo.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @author lsf
 * @Package
 * @Description
 * @data 2018/3/1 21:49
 */
public class DBHelper {

//    public static final String url = "jdbc:mysql://127.0.0.1/encs_station";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "ITS_GANSU";
    public static final String password = "ITS_GANSU_STI";

    public Connection conn = null;
    public PreparedStatement pst = null;

    public DBHelper(String sql,String url) {
        url="jdbc:mysql://"+url+"/encs_station";
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
