package com.cashsystem.cmd.impl.account;

import com.cashsystem.cmd.Subject;
import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.impl.AbstractCommand;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 11:42
 **/
@CommandMeta(
        name = "CKZH",
        desc = "重置密码",
        group = "账号信息"
)
@AdminCommand
public class AccountPasswordCommand  extends AbstractCommand {

    @Override
    public void execute(Subject subject) {

    }
}
    