package com.bit.jvm;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-15
 * Time: 21:09
 **/
public class TestGc {
    public Object instance = null;
    private static int _1MB = 1024*1024;
    private byte[] bigSize = new byte[2*_1MB];
    public static void testGC(){
        TestGc test1 = new TestGc();
        TestGc test2 = new TestGc();
        test1.instance = test2;
        test2.instance = test1;
        test1 = null;
        test2 = null;
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}    
    