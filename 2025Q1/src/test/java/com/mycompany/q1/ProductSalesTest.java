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
public class ProductSalesTest {
    
    public ProductSalesTest() {
    }

    @Test
public void CalculateTotalSales_ReturnsTotalSales() {
    ProductSales ps = new ProductSales();                          // Arrange: the object
    int[][] data = { {300, 150, 700}, {250, 200, 600} };           // Arrange: the table to test
    int actual = ps.TotalSales(data);                              // Act: call the method
    assertEquals(2200, actual);                                    // Assert: expected first, actual second
}

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        
        ProductSales ps = new ProductSales();                          // Arrange: the object
    int[][] data = { {300, 150, 700}, {250, 200, 600} };           // Arrange: the table to test
    double actual = ps.AverageSales(data);
    assertEquals(366.67,actual,0.01);
    
    }

    
    
}
