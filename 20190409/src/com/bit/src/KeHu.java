package com.bit.src;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-10
 *
 * Time: 23:16
 **/
public class KeHu {
    public static void buyComputer(Computer computer){
        computer.printComputer();
    }

    public static void Use(operatingSystem operatingSystem) {
        operatingSystem.printSystem();

    }

    public static void main(String[] args) {
            ComputerFactory computerFactory = new MiFactory();
            ComputerFactory computerFactory1 = new MacFactory();
            Computer computer = computerFactory.creatComputer();
            Computer computer1 = computerFactory1.creatComputer();
            operatingSystem  operatingSystem= computerFactory.creatSystem();
            operatingSystem operatingSystem1= computerFactory1.creatSystem();
            buyComputer(computer);
            Use( operatingSystem);
            buyComputer(computer1);
            Use( operatingSystem1);

    }
}



    