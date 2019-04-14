package com.bit.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-11
 * Time: 18:03
 **/
public class MacFactory implements ComputerFactory{

    public Computer creatComputer(){

        return new MacComputer();
    }

    @Override
    public operatingSystem creatSystem() {
        return new MacSystem();

    }

}    
    