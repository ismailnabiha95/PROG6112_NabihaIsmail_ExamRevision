package com.mycompany._exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ismai
 */
public class ProductSalesTest {
    
   

    @Test
    public void testGetSalesOverLimit() 
    {
        //arrange
        ProductSales sales = new ProductSales();
       int expected = 2;      
        //act
        int actual = sales.GetSalesOverLimit(); //call method to test
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSalesUnderLimit() 
    {
        //arrange
        ProductSales sales = new ProductSales();
          int expected = 4;  
        
        //act
         int actual = sales.GetSalesUnderLimit(); //call method to test
        //assert
         assertEquals(expected,actual);
        
    }

    @Test
public void GetTotalSales_ReturnsTotalSales()
{
    ProductSales sales = new ProductSales();
    assertEquals(2200, sales.GetTotalSales());
}

@Test
public void GetProductsProcessed_ReturnsNumberOfYears()
{
    ProductSales sales = new ProductSales();
    assertEquals(2, sales.GetProductsProcessed());
}

@Test
public void GetAverageSales_ReturnsAverageSales()
{
    ProductSales sales = new ProductSales();
    assertEquals(366.67, sales.GetAverageSales(), 0.01);   // decimals need a tolerance
}
    
    
}
