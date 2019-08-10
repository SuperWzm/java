package com.cashsystem.cmd.impl;

import com.cashsystem.cmd.Subject;

import java.util.Scanner;

public interface Command {
    Scanner scanner = new Scanner(System.in);

    void execute (Subject subject);
}
