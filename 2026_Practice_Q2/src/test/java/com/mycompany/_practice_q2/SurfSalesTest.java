package com.mycompany._practice_q2;                                  // same package as SurfSales

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SurfSalesTest {

    @Test
    public void GetSalesOverTarget_ReturnsNumberOfSales() {
        SurfSales surfSales = new SurfSales();                       // Arrange: the class holds its own data
        int actual = surfSales.GetSalesOverTarget();                 // Act
        assertEquals(3, actual);                                     // Assert: 520, 610 and 450 (int, no delta)
    }

    @Test
    public void GetSalesUnderTarget_ReturnsNumberOfSales() {
        SurfSales surfSales = new SurfSales();                       // Arrange
        int actual = surfSales.GetSalesUnderTarget();                // Act
        assertEquals(6, actual);                                     // Assert: the other six values
    }
}