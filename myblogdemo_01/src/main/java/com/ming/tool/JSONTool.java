package com.ming.tool;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ming.exception.SystemException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 15:30
 **/
public class JSONTool {
    public static String format(Object obj){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        try {
           return objectMapper.writeValueAsString(obj);//用字符串方式获取JSON数据
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new SystemException("JSON解析错误：" + obj);
        }
    }

    public static <T> T get(HttpServletRequest request,Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        try {
            return objectMapper.readValue(request.getInputStream(),clazz);//用流的方式获取JSON数据
        } catch (IOException e) {
            e.printStackTrace();
            throw new SystemException("JSON反序列化错误");
        }
    }
}    
    