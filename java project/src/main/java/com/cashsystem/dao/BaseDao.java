package com.cashsystem.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
                    ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://" + (host + ":" + port) + "/shop?useSSL=false");
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

    public String getSql(String sqlNmae){
        System.out.println("====sqlName:" + sqlNmae);
        //InputStream 是字节流   字节流转为字符流
        try(InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("script/" + sqlNmae.substring(1)+ ".sql");
            //从1开始提取sql是因为sqlName:@query_order_by_account  第一个字符是@
        ){
            if(inputStream == null){
                throw new RuntimeException("load sql" + sqlNmae +"failed");
            }else{
                try(InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader reader = new BufferedReader(inputStreamReader)){
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(reader.readLine());

                    String line;
                    while ((line = reader.readLine()) != null){
                        stringBuilder.append(" ").append(line);
                    }
                    return stringBuilder.toString();
                }
            }

        }catch (IOException e){
            throw new RuntimeException("load sql" + sqlNmae + "failed");
        }
    }

}    
    