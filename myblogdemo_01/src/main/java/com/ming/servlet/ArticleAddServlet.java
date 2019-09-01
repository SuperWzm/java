package com.ming.servlet;

import com.ming.entiy.Article;
import com.ming.exception.BussinessException;
import com.ming.exception.ParameterException;
import com.ming.tool.JSONTool;
import com.ming.tool.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-29
 * Time: 14:40
 **/
public class ArticleAddServlet extends BaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String userAccout = req.getParameter("userAccout");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        //对于application/json数据，需要使用request.getInputstream来获取
        //获取JSON类型的请求数据
        Article article = JSONTool.get(req,Article.class);

        //处理业务及数据库操作
        try {
            connection = db.getConnection();
            String sql ="insert into article(title, content, user_id, create_time)\n " +
                    "select ?,?,user.id,now() from user\n " +
                    "where user.name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,article.getTitle());
            preparedStatement.setString(2,article.getContent());
            preparedStatement.setString(3,article.getUserAccout());
            int r = preparedStatement.executeUpdate();
            if(r > 0){
                return r;
            }else{
                throw new BussinessException("没有该用户"+userAccout);
            }
        }finally {
            db.close(connection,preparedStatement,null);
        }
    }
}
    