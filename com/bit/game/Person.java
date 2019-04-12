package com.bit.game;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-06
 * Time: 14:51
 **/
public class Person {
    private String name;
    private int score;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public void addScore() {
        this.score++;
    }

    public String fist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你出的招数：石头，剪刀，布");
        String str = scanner.nextLine();
        return str;
    }
}

    