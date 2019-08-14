package com.cashsystem.cmd;

import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.enity.Account;
import com.sun.jmx.remote.internal.ClientCommunicatorAdmin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 15:03
 **/
public class CheckStand extends AbstractCommand {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new CheckStand().execute(subject);
    }
    @Override
    public void execute(Subject subject) {
        Commands.getCachedHelpCommands().execute(subject);
        while (true){
            System.out.println(">>>");
            //登录  DL
            String line = scanner.nextLine();
            //可能输入的是小写，需要转换为大写
            String commandCode = line.trim().toUpperCase();
            Account account = subject.getAccount();
            if(account == null){
                Commands.getEntranceCommand(commandCode).execute(subject);
            }else{
                switch (account.getAccountType()){
                    case ADMIN:
                        Commands.getAdminCommand(commandCode).execute(subject);
                        break;
                    case CUSTOMER:
                        Commands.getCustomerCommand(commandCode).execute(subject);
                        break;
                        default:
                }
            }
        }
    }
}
    