/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.carwashcalc_gui_q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class CarWashTest {
    
   @Test
    public void CalculateTotal_ReturnsTotalDue()
    {
        // Arrange: create the object and the test values
        CarWash wash = new CarWash();             // object to call the method on
        double subtotal = 360;                    // SUV, 3 vehicles
        double discount = 36;                   // 10% of 360 for a member

        // Act: call the method
        double result = wash.CalculateTotal(subtotal, discount);   // pass the two values

        // Assert: expected value first, then the actual result, then the allowed difference
        assertEquals(372.6, result, 0.01);         // worked out by hand: (360 - 36) plus 15% VAT
    }

    @Test
public void ValidateData_ReturnsFalseForZeroQuantity()
{
    // Arrange: create the object and the test values
    ValidateData validator = new ValidateData();  // object to call the method on
    String name = "Sipho";                        // a valid name, so only the quantity can cause the failure
    int quantity = 0;                          // the quantity the paper says to test

    // Act: call the method
    boolean result = validator.IsValid(name, quantity);   // pass the name, then the quantity

    // Assert: we expect false
    assertFalse(result);                            // which variable holds the result?
}
    
}
