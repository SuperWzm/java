package com.ming.servlet;

import com.ming.entiy.Article;
import com.ming.exception.BussinessException;
import com.ming.exception.ParameterException;
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
 * Date: 2019-08-31
 * Time: 9:48
 **/
@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends BaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String ids = req.getParameter("ids");
        int[] intIds = null;
        try {
            String[] idsArray = ids.split(",");
            intIds = new int[idsArray.length];
            for (int i = 0; i < idsArray.length; i++) {
                intIds[i] = Integer.parseInt(idsArray[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new ParameterException("请求参数错误ids=" + ids);
        }

        try{
            connection = db.getConnection();
            StringBuilder sql = new StringBuilder("delete from article where id in(");
            for (int i = 0; i < intIds.length; i++) {
                if(i == 0){
                    sql.append("?");
                }else{
                    sql.append(",?");
                }
            }
            sql.append(")");
            String strsql = sql.toString();
            System.out.println(strsql);
            preparedStatement = connection.prepareStatement(strsql);
            for (int i = 0; i < intIds.length; i++) {
                preparedStatement.setInt(i+1,intIds[i]);
            }
            int r = preparedStatement.executeUpdate();
            if(r > 0){
                return r;
            }else{
                throw new BussinessException("没有该篇文章");
            }
        }finally {
            db.close(connection,preparedStatement,null);
        }
    }
}
    