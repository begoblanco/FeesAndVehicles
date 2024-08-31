package dev.bego;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCalculateFee() {
        Vehicle car = new Car("ABC123");
        assertEquals(100.00, car.calculateFee());
    }

    @Test
    public void testGetLicensePlate() {
        Vehicle car = new Car("ABC123");
        assertEquals("ABC123", car.getLicensePlate());
    }
}
