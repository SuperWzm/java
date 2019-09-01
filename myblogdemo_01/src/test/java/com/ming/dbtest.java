package com.ming;

import com.ming.tool.db;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 12:41
 **/
public class dbtest {

    @Test
    public void testConnection(){
        Connection connection = db.getConnection();
//       System.out.println(connection);
//        Assert.assertNull(connection);
    }
}    
    