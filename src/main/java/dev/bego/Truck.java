package dev.bego;

public class Truck extends Vehicle {

    private static final double TRUCK_FEE = 50;

    private int numberOfAxles;

    public Truck(String licensePlate, int numberOfAxles) {
        super(licensePlate);
        this.numberOfAxles = numberOfAxles;
        
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double calculateFee() {
        return TRUCK_FEE * numberOfAxles;
    }
    
}
