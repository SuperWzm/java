package com.bit.annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-20
 * Time: 13:58
 **/
public class TestMember {

    public static void code1() {
        Class cls = Member.class;
        Annotation[] annotations = cls.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println(annotation);
        }
//        try{
//            Method method = cls.getMethod("toString");
//            Annotation[] annotations = method.getAnnotation();
//            for (Annotation annotation:annotations){
//                System.out.println(annotation);
//
//            }
//
    }

    public static void main(String[] args) {
        Class cls = Member.class;
        MyAnnotation myAnnotation = (MyAnnotation) cls.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation);
        int age = myAnnotation.age();
        String name = myAnnotation.name();
        System.out.println(name +" " + age);
    }
}    
    