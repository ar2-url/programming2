package com.abc.command;

public class CommandExecutor {
    public void executeCommand(UserCommand command) {
        command.execute();
    }
}
