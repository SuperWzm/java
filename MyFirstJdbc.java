package com.bit.com.bit.jdbc;


import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-30
 * Time: 18:55
 **/
public class MyFirstJdbc {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/memo?user=root&password=root";
            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();

            String sql = "select id,name,created_time,modify_time from memo_group";

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Timestamp creatTime = resultSet.getTimestamp("created_time");
                Timestamp modifyTime = resultSet.getTimestamp("modify_time");
                System.out.println(id+" "+name+" "+creatTime+" "+modifyTime);

            }
            resultSet.close();

            statement.close();

            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}    
    