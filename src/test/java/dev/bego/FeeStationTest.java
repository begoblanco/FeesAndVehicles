package dev.bego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FeeStationTest {

    private FeeStation feeStation;

    @BeforeEach
    public void setUp() {
        feeStation = new FeeStation("Miau Station", "Miau City");
    }

    @Test
    public void testFeeStationInitialization() {
        assertEquals("Miau Station", feeStation.getName());
        assertEquals("Miau City", feeStation.getCity());
        assertEquals(0.00, feeStation.getTotalFeeCollected());
        assertTrue(feeStation.getVehicles().isEmpty());
    }

    @Test
    public void testProcessVehicleAddsVehicleAndUpdatesTotalFee() {
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");

        feeStation.processVehicle(car);
        assertEquals(100.00, feeStation.getTotalFeeCollected());
        assertEquals(1, feeStation.getVehicles().size());

        feeStation.processVehicle(motorcycle);
        assertEquals(150.00, feeStation.getTotalFeeCollected());
        assertEquals(2, feeStation.getVehicles().size());
    }

    @Test
    public void testSetVehiclesUpdatesList() {
        Vehicle car = new Car("ABC123");
        List<Vehicle> vehicles = List.of(car);

        feeStation.setVehicles(vehicles);
        assertEquals(vehicles, feeStation.getVehicles());
    }

    @Test
    public void testPrint() {
        Vehicle truck = new Truck("TRK456", 4);
        feeStation.processVehicle(truck);
        feeStation.print();
    }
}
