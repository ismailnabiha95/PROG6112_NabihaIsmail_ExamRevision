
package com.mycompany.q1;

/**
 *
 * @author ismai
 */
public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) 
    {
       

    int total = 0;                                 // before BOTH loops
    for (int row = 0; row < productSales.length; row++)   // outer: each row
    {
        for (int col = 0; col < productSales[row].length; col++)   // inner: each column in THIS row
        {
            total = total + productSales[row][col];       // add every single value
        }
    }
    return total;                                  // after both loops

    }

    @Override
public double AverageSales(int[][] productSales)
{
    int total = TotalSales(productSales);                                  // call your own TotalSales method
    int count = 0;                                     // number of values
    for (int row = 0; row < productSales.length; row++)
    {
        count = count + productSales[row].length;                          // how many columns are in this row?
    }
    return (double) total /count ;                                      // cast one side to double, then divide
}

    @Override
    public int MaxSale(int[][] productSales) {
        
        int max = productSales[0][0];                     // the first value in the table
    for (int row = 0; row < productSales.length; row++)   // each row
    {
        for (int col = 0; col < productSales[row].length; col++)   // each column
        {
            if (productSales[row][col] > max)         // newcomer on the left
            {
                max = productSales[row][col];         // keep the VALUE
            }
        }
    }
    return max;                                // after both loops
       
    }

    @Override
    public int MinSale(int[][] productSales) {
        
         int min = productSales[0][0];                     // the first value in the table
    for (int row = 0; row < productSales.length; row++)   // each row
    {
        for (int col = 0; col < productSales[row].length; col++)   // each column
        {
            if (productSales[row][col] < min)         // newcomer on the left
            {
                min = productSales[row][col];         // keep the VALUE
            }
        }
    }
    return min;                                // after both loops
       
        
    }
    
}
