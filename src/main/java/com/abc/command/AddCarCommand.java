package com.abc.command;

import com.abc.Car;
import com.abc.CarRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddCarCommand implements UserCommand {
    private final CarRepository carRepository;
    private final String model;
    private final String vin;

    @Override
    public void execute() {
        carRepository.add(new Car(model, vin));
    }
}
