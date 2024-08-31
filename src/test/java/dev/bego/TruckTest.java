package dev.bego;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {

    @Test
    public void testCalculateFee() {
        Vehicle truck = new Truck("TRK456", 4);
        assertEquals(200.00, truck.calculateFee());
    }

    @Test
    public void testGetLicensePlate() {
        Vehicle truck = new Truck("TRK456", 4);
        assertEquals("TRK456", truck.getLicensePlate());
    }

    @Test
    public void testGetAxles() {
        Truck truck = new Truck("TRK456", 4);
        assertEquals(4, truck.getNumberOfAxles());
    }
}
