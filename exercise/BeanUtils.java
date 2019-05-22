package com.bittch.reflect.exercise;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-21
 * Time: 18:55
 **/
public class BeanUtils {
    public static void copy(Object source,Object target) {
        //1丶参数效验
        if(source == null){
            throw new IllegalArgumentException("source object must be not nul");

        }
        if(target == null){
            throw new IllegalArgumentException("target object must be not null");
        }

        //2丶获取Class对象
        Class sourceCls = source.getClass();
        Class targetCls = target.getClass();

        //3丶获取Class对象中的Field
        Field[] sourceFields = sourceCls.getDeclaredFields();
        Field[] targetFields = targetCls.getDeclaredFields();

        //4丶通过sourceFields在targetFields找它元素相同(名字和类型)
        for(Field sf : sourceFields){
            for(Field tf : targetFields){
                if(sf.getName().equals(tf.getName()) && sf.getType() == tf.getType()){
                    try{
                        sf.setAccessible(true);
                        tf.setAccessible(true);
                        Object value = sf.get(source);
                            tf.set(target,value);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
    }

    