package com.abc.command;

import com.abc.CarRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class CommandFactory {
    private final CarRepository carRepository;

    public Optional<UserCommand> ofUserInput(String inputLine) {
        String[] s = inputLine.split(" ");

        AcceptedCommands acceptedCommands

        if (inputLine.startsWith("list")) {
            // ListCarsCommand
        } else if (inputLine.startsWith("add")) {
            /**
             * 'add Vauxhall-Astra abc123'
             */
            return new AddCarCommand(carRepository, s[1], s[2]);
        } else if (inputLine.startsWith("remove")) {
            // RemoveCarCommand
        } else {
            return Optional.empty();
        }
    }
}
