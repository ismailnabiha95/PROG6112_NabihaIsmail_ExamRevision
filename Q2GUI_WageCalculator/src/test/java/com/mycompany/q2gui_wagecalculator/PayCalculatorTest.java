/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q2gui_wagecalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class PayCalculatorTest {
    
    @Test
    public void CalculatePay_ReturnsPayWithOvertime()
    {
        // Arrange: create the object and the test values
        PayCalculator calculator = new PayCalculator();   // object to call the method on
        double hours = 45;                        // over 40, so overtime applies
        double rate = 100;                        // hourly rate

        // Act: call the method
        double result = calculator.CalculatePay(hours, rate);   // pass the hours, then the rate

        // Assert: expected value first, then the actual result, then the allowed difference
        assertEquals(4750, result, 0.01);         // by hand: 40 x 100 plus 5 x 100 x 1.5
    }

    @Test
    public void CalculatePay_ReturnsPayWithoutOvertime()
    {
        // Arrange
        PayCalculator calculator = new PayCalculator();   // object to call the method on
        double hours = 30 ;                      // the paper says how many hours?
        double rate = 100;                        // hourly rate

        // Act
        double result = calculator.CalculatePay(hours, rate);   // call the method

        // Assert
        assertEquals(3000, result, 0.01);         // by hand: no overtime, so hours x rate
    }
    
}
