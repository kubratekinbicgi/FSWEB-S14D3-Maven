package org.example.company;

public class Holden extends Car {
    public Holden( int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Holden engine is now running!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Holden accelerates swiftly!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Holden brakes are applied.";
    }
}
