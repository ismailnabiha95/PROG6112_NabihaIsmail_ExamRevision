package com.mycompany._practice_q2;

public class SurfSales implements ISurfSales {

    private static final int TARGET = 400;                                        // the sales target, stored as a constant
    private int[][] sales = { {520, 380, 150}, {610, 340, 210}, {450, 290, 200} };   // the class's own data: row = year, column = product

    @Override
    public int[][] GetProductSales() {
        return sales;                                                             // hand the table out
    }

    @Override
    public int GetTotalSales() {
        int total = 0;                                                            // before BOTH loops
        for (int row = 0; row < sales.length; row++)                              // outer: each row
        {
            for (int col = 0; col < sales[row].length; col++)                     // inner: each column in this row
            {
                total = total + sales[row][col];                                  // add every single value
            }
        }
        return total;                                                             // after both loops
    }

    @Override
    public int GetSalesOverTarget() {
        int count = 0;                                                            // start at 0, before both loops
        for (int row = 0; row < sales.length; row++)                              // outer: each row
        {
            for (int col = 0; col < sales[row].length; col++)                     // inner: each column in this row
            {
                if (sales[row][col] > TARGET)                                     // over means greater than the target
                {
                    count = count + 1;                                            // add 1, never the value
                }
            }
        }
        return count;                                                             // after both loops
    }

    @Override
    public int GetSalesUnderTarget() {
        int count = 0;                                                            // start at 0, before both loops
        for (int row = 0; row < sales.length; row++)                              // outer: each row
        {
            for (int col = 0; col < sales[row].length; col++)                     // inner: each column in this row
            {
                if (sales[row][col] <= TARGET)                                    // under means 400 or less
                {
                    count = count + 1;                                            // add 1, never the value
                }
            }
        }
        return count;                                                             // after both loops
    }

    @Override
    public int GetYearsProcessed() {
        return sales.length;                                                      // number of rows, calculated not typed
    }

    @Override
    public double GetAverageSales() {
        int count = 0;                                                            // how many values are in the table
        for (int row = 0; row < sales.length; row++)                              // one pass per row
        {
            count = count + sales[row].length;                                    // add the number of columns in this row
        }
        return (double) GetTotalSales() / count;                                  // reuse the total method; cast keeps the decimals
    }
}