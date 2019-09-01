package com.ming.entiy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 15:08
 **/
@ToString
@Setter
@Getter
public class Article {

    private String userAccout;

    private Integer userId;

    private String title;

    private String content;

    private Integer id;

    private Date createTime;

}
    