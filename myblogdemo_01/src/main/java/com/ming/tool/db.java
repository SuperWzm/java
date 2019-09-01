package com.ming.tool;

import com.ming.exception.SystemException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


import javax.sql.DataSource;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 11:56
 **/
public class db {

    private static final String URL = "jdbc:mysql://localhost:3306/blogdemo";

    private static final String USER_NAME = "root";

    private static final String PASSWORD = "woqu0310";

    private static volatile DataSource DATASOURCE;

    private db(){

    }

    public static DataSource getDataSource(){
        if(DATASOURCE == null){  //提高效率，过滤其他线程
//            synchronized (DATASOURCE){
//            synchronized (DATASOURCE.getClass()){
            synchronized (db.class){     //对这个静态类加锁，互斥锁，保证只有一个线程进入
                if(DATASOURCE == null){
                    DATASOURCE = new MysqlDataSource();
                    ((MysqlDataSource)DATASOURCE).setUrl(URL);
                    ((MysqlDataSource)DATASOURCE).setUser(USER_NAME);
                    ((MysqlDataSource)DATASOURCE).setPassword(PASSWORD);
                }
            }
        }
        return DATASOURCE;
    }

    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if(preparedStatement != null) {
                    preparedStatement.close();
                }
                if(resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                //TODO 处理数据库异常
                throw new SystemException("数据库错误");
            }
        }
    }
    