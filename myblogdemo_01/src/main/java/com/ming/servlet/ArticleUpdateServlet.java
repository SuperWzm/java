package com.ming.servlet;

import com.ming.entiy.Article;
import com.ming.exception.BussinessException;
import com.ming.tool.JSONTool;
import com.ming.tool.db;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-29
 * Time: 16:37
 **/
@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends BaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //前端传过来的数据{"id":"2","title":"","content":""}

        //获取JSON类型的请求数据
        Article article = JSONTool.get(req,Article.class);

        //处理业务及数据库操作
        try {
            connection = db.getConnection();
            String sql ="update article set title=?,content=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,article.getTitle());
            preparedStatement.setString(2,article.getContent());
            preparedStatement.setInt(3,article.getId());
            int r = preparedStatement.executeUpdate();
            if(r > 0){
                return r;
            }else{
                throw new BussinessException("没有该篇文章"+article.getId());
            }
        }finally {
            db.close(connection,preparedStatement,null);
        }
    }
}
    