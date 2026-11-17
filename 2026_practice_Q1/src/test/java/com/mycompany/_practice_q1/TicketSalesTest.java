package com.mycompany._practice_q1;                              // same package as TicketSales

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketSalesTest {

    @Test
    public void CalculateTotalTicketSales_ReturnsTotalTicketSales() {
        TicketSales ticketSales = new TicketSales();                          // Arrange: the object
        int[][] data = { {420, 310, 180, 390}, {450, 280, 220, 390} };        // Arrange: the table, declared HERE
        int actual = ticketSales.TotalTicketSales(data);                      // Act
        assertEquals(2640, actual);                                           // Assert: ints, no delta
    }

    @Test
    public void AverageTicketSales_ReturnsAverageTicketSales() {
        TicketSales ticketSales = new TicketSales();                          // Arrange
        int[][] data = { {420, 310, 180, 390}, {450, 280, 220, 390} };        // Arrange
        double actual = ticketSales.AverageTicketSales(data);                 // Act
        assertEquals(330, actual, 0.01);                                      // Assert: 2640 / 8, doubles need the delta
    }
}