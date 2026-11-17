
package com.mycompany.hotel_revenue_q5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HotelTest {
    
    @Test
public void Revenue_ReturnsNightsTimesPrice()
{
    // Arrange: the object, the nights, the price and the expected revenue
    Hotel hotel = new Hotel();                                          // object to call the method on
    int[] nights = {10, 12, 9, 11};                                     // 42 nights in total
    double price = 500.0;                                               // the price per night for a Single
    double expected = 21000.0;                                          // by hand: 42 nights x 500 = 21000

    // Act: call the method and keep the result
    double actual = hotel.Revenue(nights, price);                       // nights first, then the price

    // Assert: a double, so add the tolerance
    assertEquals(expected, actual, 0.01);                               // 0.01 = allowed tiny difference
}

@Test
public void TopEarner_ReturnsTopEarner()
{
    // Arrange: the object, the names, the revenues and the expected name
    Hotel hotel = new Hotel();                                          // object to call the method on
    String[] roomTypes = {"Single", "Double", "Suite"};                 // the three room types
    double[] revenues = {21000.0, 25500.0, 21000.0};                    // the REVENUES in the same order as roomTypes
    String expected = "Double";                                         // 25500 is the highest, at position 1

    // Act: call the method and keep the result
    String actual = hotel.TopEarner(roomTypes, revenues);               // names first, then revenues

    // Assert: Strings need no tolerance
    assertEquals(expected, actual);
}
}
