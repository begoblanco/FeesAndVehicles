package dev.bego;

public class Motorcycle extends Vehicle {

    private static final double MOTORCYCLE_FEE = 50;

    public Motorcycle(String licensePlate) {
        super(licensePlate);

    }

    @Override
    public double calculateFee() {
        return MOTORCYCLE_FEE;
    }
}
