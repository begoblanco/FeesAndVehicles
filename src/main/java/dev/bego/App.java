package dev.bego;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        FeeStation feeStation = new FeeStation("Miau Station", "Miau City");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("DEF456");
        Vehicle truck = new Truck("TRK456", 4);

        feeStation.processVehicle(car);
        feeStation.processVehicle(motorcycle);
        feeStation.processVehicle(truck);

        feeStation.print();
    }
}
