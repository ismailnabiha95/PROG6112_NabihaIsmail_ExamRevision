/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class MovieTicketsTest {
    
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales()   // exact name from the paper
    {
        // Arrange: create the object and the test values
        MovieTickets tickets = new MovieTickets();          // object to call the method on
        int[] napoleon = {3000, 1500, 1700};                // one movie's months (a 1D array, as the method needs)

        // Act: call the method
        int result = tickets.TotalMovieSales(napoleon);         // which variable do we pass in?

        // Assert: expected value first, then the actual result
        assertEquals(6200, result);                         // worked out by hand: 3000 + 1500 + 1700
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie()             // exact name from the paper
    {
        // Arrange: create the object and the test values
        MovieTickets tickets = new MovieTickets();          // object to call the method on
        String[] movies = {"Napoleon", "Oppenheimer"};      // the movie names
        int[] totalSales = {6200, 6300};                    // the two totals, in the same order as the names

        // Act: call the method
        String result = tickets.TopMovie(movies, totalSales);     // names first, then the totals

        // Assert: expected value first, then the actual result
        assertEquals("Oppenheimer", result);                       // the name of the top movie, in quotes
    }
    
}
