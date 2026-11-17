/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class MovieTicketsTest {
    
    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully()   // exact name from the paper
    {
        // Arrange: create the object and the test values
        MovieTickets tickets = new MovieTickets();          // object to call the method on
        int numberOfTickets = 3;                            // three tickets
        double ticketPrice = 100;                          // the price in the paper's sample

        // Act: call the method
        double result = tickets.CalculateTotalTicketPrice(numberOfTickets,ticketPrice);   // tickets first, then the price

        // Assert: expected value first, then the actual result, then the allowed difference
        assertEquals(342, result, 0.01);                   // 3 x 100 plus 14% VAT
    }

    @Test
    public void ValidateData_ReturnsFalseForInvalidTicketPrice()   // any validation test is accepted
    {
        // Arrange: build a data object with an invalid price
        MovieTickets tickets = new MovieTickets();          // object to call the method on
        MovieTicketData data = new MovieTicketData();       // the data object
        data.setMovieName("Napoleon");                      // a valid name
        data.setNumberOfTickets(3);                         // a valid number of tickets
        data.setTicketPrice(0);                          // an invalid price: which value breaks the rule?

        // Act: call the method
        boolean result = tickets.ValidateData(data);        // pass the data object

        // Assert: we expect false
        assertFalse(result);                                // passes when the result is false
    }
    
}
