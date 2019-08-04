package com.cashsystem.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 16:34
 **/
public class BaseDao {
    //连接数据库

    private static volatile DataSource dataSource;

    //采用基本实现
    private DataSource getDataSource() {
        if (dataSource == null) {
            synchronized(DataSource.class) {
                if (dataSource == null) {
                    dataSource = new MysqlDataSource();//MySql数据源
                    String host = "127.0.0.1";
                    String port = "3306";
                    ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://" + (host + ":" + port) + "/check_stand");
                    ((MysqlDataSource) dataSource).setUser("root");
                    ((MysqlDataSource) dataSource).setPassword("woqu0310");
                }
            }
        }
        return dataSource;
    }

    protected Connection getConnection(boolean autoCommit) throws SQLException {
        //获取连接
        Connection connection = this.getDataSource().getConnection();
        //如果true  每写一条语句 自动进行提交
        connection.setAutoCommit(autoCommit);
        return connection;
    }
    //PreparedStatement 和 Statement 的区别？
    //前者可以预编译
    protected void closeResource(ResultSet resultSet, PreparedStatement statement, Connection connection) {
        //结果 -> 命令 -> 连接
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}    
    