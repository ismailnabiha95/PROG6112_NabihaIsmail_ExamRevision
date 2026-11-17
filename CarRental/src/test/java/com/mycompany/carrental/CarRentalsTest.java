package com.mycompany.carrental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarRentalsTest {
    
    
    @Test
    public void testCalculateTotalRentalPrice() {
        //arrange
        CarRentals rental = new CarRentals();
        double expected = 1380.0;
        //act
        double actual=rental.CalculateTotalRentalPrice(3, 400);
        //assert
        assertEquals(expected,actual,0.01);
    }

    @Test
public void ValidateData_DaysZero_ReturnsFalse() {
    // arrange: data with an invalid number of days
    CarRentals rental = new CarRentals();
    CarRentalData data = new CarRentalData();
    data.setCarName("VW Polo");
    data.setNumberOfDays(0);          // breaks the rule (must be above 0)
    data.setDailyRate(300);
    // act
    boolean result = rental.ValidateData(data);
    // assert: invalid data must be rejected
    assertFalse(result);
}

@Test
public void ValidateData_ValidData_ReturnsTrue() {
    CarRentals rental = new CarRentals();
    CarRentalData data = new CarRentalData();
    data.setCarName("VW Polo");
    data.setNumberOfDays(3);
    data.setDailyRate(300);
    assertTrue(rental.ValidateData(data));
}

    
}
