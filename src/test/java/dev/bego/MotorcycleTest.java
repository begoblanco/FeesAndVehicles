package dev.bego;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    @Test
    public void testCalculateFee() {
        Vehicle motorcycle = new Motorcycle("XYZ987");
        assertEquals(50.00, motorcycle.calculateFee());
    }

    @Test
    public void testGetLicensePlate() {
        Vehicle motorcycle = new Motorcycle("XYZ987");
        assertEquals("XYZ987", motorcycle.getLicensePlate());
    }
}
