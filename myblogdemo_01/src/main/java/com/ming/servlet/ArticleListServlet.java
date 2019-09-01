package com.ming.servlet;

import com.ming.entiy.Article;
import com.ming.exception.ParameterException;
import com.ming.tool.JSONTool;
import com.ming.tool.db;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 14:11
 **/
public class ArticleListServlet extends BaseServlet {


    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println(req.getParameter("id"));
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Article> articles = new ArrayList<>();
        //处理前端请求数据
        String sid = req.getParameter("id");
        Integer id = null;
        try{
            id = Integer.parseInt(sid);
        }catch (Exception e){
            throw new ParameterException("id错误(" + sid + ")");
        }

        //处理业务及数据库操作
        try {
            connection = db.getConnection();
            String sql = "select a.id,a.title,a.content,a.create_time\n " +
                    "from article a join user u on a.user_id = u.id where u.id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);//TODO 处理前端异常
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Article article = new Article();
                article.setId(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));
                article.setContent(resultSet.getString("content"));
                article.setCreateTime(resultSet.getTimestamp("create_time"));
                articles.add(article);
            }
        }finally {
//                if(rs != null) {
//                    rs.close();
//                }
//                if(ps != null) {
//                    ps.close();
//                }
//                if(rs != null) {
//                    rs.close();
//                }
            db.close(connection,preparedStatement,resultSet);
            }
            return articles;
    }
}
    