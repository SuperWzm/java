package com.bit.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-11
 * Time: 18:05
 **/
public class MiFactory implements ComputerFactory{

    public Computer creatComputer(){

        return new MiComputer();
    }

    @Override
    public operatingSystem creatSystem() {
        return new Windows8System();

    }

}
    