package com.abc;

import com.abc.command.AddCarCommand;
import com.abc.command.CommandExecutor;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        CarRepository carRepository = new CarRepository();
        Scanner scanner = new Scanner(System.in);

        System.out.print("> ");
        String inputLine = scanner.nextLine();






    }
}
