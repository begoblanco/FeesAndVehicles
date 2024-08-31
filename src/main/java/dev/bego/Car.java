package dev.bego;

public class Car extends Vehicle {

    private static final double CAR_FEE = 100;

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateFee() {
        return CAR_FEE;
    }

    
    
}
