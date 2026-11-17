package com.mycompany._q2;                                  // same package as the class being tested

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {

    @Test
    public void CalculateCommission_CalculatedSuccessfully() {
        EstateAgent agent = new EstateAgent();                       // Arrange: the object
        double actual = agent.CalculateCommission("800000", "10");   // Act: price and percentage as text
        assertEquals(80000, actual, 0.01);                           // Assert: 800000 x 10 / 100, delta for doubles
    }

    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() {
        EstateAgent agent = new EstateAgent();                       // Arrange
        double actual = agent.CalculateCommission("800000", "10");   // Act
        assertTrue(actual != 70000);                                 // Assert: a wrong value is NOT returned
    }

    @Test
    public void ValidateData_ReturnsFalseForZeroPrice() {
        EstateAgent agent = new EstateAgent();                       // Arrange: the object
        Data data = new Data();                                      // Arrange: a data object with ONE bad value
        data.setLocation("Cape Town");
        data.setName("Joe Bloggs");
        data.setPrice(0);                                            // the invalid value
        data.setCommission(10);
        boolean actual = agent.ValidateData(data);                   // Act
        assertFalse(actual);                                         // Assert: expected false
    }
}