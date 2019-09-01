package com.ming.servlet;

import com.ming.entiy.JSON;
import com.ming.exception.ParameterException;
import com.ming.exception.SystemException;
import com.ming.tool.JSONTool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 17:09
 **/

//使用模板设计模式
public abstract class BaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json;charset=UTF-8");

        JSON result = new JSON();
        try {
            Object data = process(req, resp);
            result.setSuccess(true);
            result.setCode("200");
            result.setMessage("操作成功");
            result.setData(data);
        }catch (Exception e){
            e.printStackTrace();
            if(e instanceof ParameterException){
                result.setCode(((ParameterException) e).getCode());
                result.setMessage(((ParameterException) e).getMessage());
            }else if(e instanceof SystemException){
                result.setCode(((SystemException) e).getCode());
                result.setMessage(((SystemException) e).getMessage());
            }else{
                result.setCode("500");
                result.setMessage("服务器错误");
            }
        }
        //TODO  待处理异常
        resp.getWriter().write(JSONTool.format(result));
    }

    public abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
    