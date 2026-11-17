
package com.mycompany.taxitrips_q1exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaxiTripsTest {
    
    @Test
public void CalculateTotalTrips_ReturnsExpectedTotal()
{
    TaxiTrips taxi = new TaxiTrips();
    int[] thabo = {8, 10, 7, 12, 9};
    int expected = 46;                            // worked out by hand
    int actual = taxi.TotalTrips(thabo);
    assertEquals(expected, actual);
}

@Test
public void TopDriver_ReturnsTopDriver()
{
    TaxiTrips taxi = new TaxiTrips();
    String[] drivers = {"Thabo", "Lerato", "Sipho"};
    int[] totals = {46, 51, 48};
    String actual = taxi.TopDriver(drivers, totals);
    assertEquals("Lerato", actual);
}
    
}
