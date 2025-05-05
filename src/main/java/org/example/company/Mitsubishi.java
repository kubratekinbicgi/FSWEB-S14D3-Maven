package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": engine start log");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": accelerate log");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": brake log");
        return "the car is braking";
    }
}
