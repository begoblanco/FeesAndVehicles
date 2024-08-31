package dev.bego;

import java.util.ArrayList;
import java.util.List;

public class FeeStation {

     private String name;
     private String city;
     private double totalFeeCollected;
     private List<Vehicle> vehicles;

     public FeeStation(String name, String city) {
         this.name = name;
         this.city = city;  
         this.totalFeeCollected = 0.00;
         this.vehicles = new ArrayList<>();
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTotalFeeCollected() {
        return totalFeeCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void processVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalFeeCollected += vehicle.calculateFee();
    }

    public void print() {
        System.out.println("Fee station: " + name + " (" + city + ")");
        System.out.println();
        System.out.println("Vehicles: ");
        System.out.println();
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getLicensePlate());
            System.out.println(vehicle.calculateFee() + "$");
            System.out.println();
        }

        System.out.println("Total fee collected: " + totalFeeCollected + "$");
    }
}
