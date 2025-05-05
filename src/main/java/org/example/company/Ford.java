package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Ford engine starts with a rumble!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Ford is gaining speed!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Ford is coming to a stop.";
    }
}
