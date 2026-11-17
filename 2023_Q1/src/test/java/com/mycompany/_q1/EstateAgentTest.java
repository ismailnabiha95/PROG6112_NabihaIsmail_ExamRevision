/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        EstateAgent agent = new EstateAgent();                         // object of your class
        double[][] sales = { {800000, 1500000, 2000000}, {700000, 1200000, 1600000} };   // row = agent, column = month
        double expected = 4300000;
        double actual = agent.EstateAgentSales(sales[0]);
        assertEquals(expected,actual,0.01);
    }

    @Test
public void CalculateTotalCommission_ReturnsCommission() {
    EstateAgent agent = new EstateAgent();                       // Arrange: the object
    double total = 4300000;                                      // Arrange: Joe's total sales
    double expected = 86000;                                     // 2% of 4 300 000
    double actual = agent.EstateAgentCommission(total);          // Act: pass the total in
    assertEquals(expected, actual, 0.01);                        // Assert: doubles need the delta
}

    @Test
    public void TopAgent_ReturnsTopPosition() {
        EstateAgent agent = new EstateAgent(); 
        double[] totals = {4300000, 3500000};
        int result = agent.TopEstateAgent(totals);
        assertEquals(0, result);
    }
    
}
