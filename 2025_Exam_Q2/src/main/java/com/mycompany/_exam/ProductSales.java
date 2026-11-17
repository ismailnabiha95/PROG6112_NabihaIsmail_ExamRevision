
package com.mycompany._exam;


public class ProductSales implements IProductSales
{

    private final int [][] sales = 
    {
        //2d array
        {300,150,700},
        
        {250,200,600},
    };
    
    private final static int SALES_LIMIT = 500; //constant
    
    @Override
    public int[][] GetProductSales() 
    {
        return sales; //returns 2d sales array
    }

    @Override
    public int GetTotalSales() 
    {
        int total = 0; // variable used to store total sales
        // Nested loop which will look at 2D array values to add up
        //outer loop looking at rows
        for (int row = 0; row < sales.length; row++) 
        {//inner loop looking at columns
            for (int col = 0; col<sales[row].length; col++)
            {
                total+=sales[row][col];     //total = total + sales[row][col]
            }//inner
        
        }//outer
        
        return total;
    }

    @Override
    public int GetSalesOverLimit() 
    {
        int count = 0;
    for (int row = 0; row < sales.length; row++)
    {
        for (int col = 0; col < sales[row].length; col++)
        {
            if (sales[row][col] > SALES_LIMIT)
            {
                count++;
            }
        }
    }
    return count;
    }

    @Override
    public int GetSalesUnderLimit() 
    {
        //counter
        int count = 0;
        //loop through each year
    for (int row = 0; row < sales.length; row++)
    {
        //loop through each product
        for (int col = 0; col < sales[row].length; col++)
        {
            //check if sales are less than 500
            if (sales[row][col] <SALES_LIMIT)
            {
                //increase counter when condition is true
                count++;
            }
        }
    }
    return count;
    }

    @Override
    public int GetProductsProcessed() 
    {
        return sales.length;      // number of rows = number of years
    }

    @Override
    public double GetAverageSales() 
    {
        int count = 0;//count no. of sale values
        for (int row = 0; row < sales.length; row++) 
        {//inner loop looking at columns
            for (int col = 0; col<sales[row].length; col++)
            {
                count++;
            }//inner
        
        }//outer
        
        if (count ==0)
        {
          return 0;
        }
        return (double) GetTotalSales() / count;
    }
    
}
