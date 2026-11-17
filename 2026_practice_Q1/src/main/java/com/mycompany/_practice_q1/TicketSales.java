
package com.mycompany._practice_q1;


public class TicketSales implements ITicketSales{

    @Override
    public int TotalTicketSales(int[][] ticketSales) {
        int total = 0;                                 // before BOTH loops
    for (int row = 0; row <  ticketSales.length; row++)   // outer: each row
    {
        for (int col = 0; col <  ticketSales[row].length; col++)   // inner: each column in THIS row
        {
            total = total +  ticketSales[row][col];       // add every single value
        }
    }
    return total;                                  // after both loops
    }

    @Override
    public double AverageTicketSales(int[][] ticketSales) {
        int count = 0;                                 // how many values are in the table
    for (int row = 0; row < ticketSales.length; row++)   // one pass per row
    {
        count = count + ticketSales[row].length;         // add the number of columns in this row
    }
    return (double) TotalTicketSales (ticketSales) / count;     // reuse the total method; cast keeps the decimals.
    }

    @Override
    public int HighestSale(int[][] ticketSales) {
         int highest = ticketSales[0][0];                     // the first value in the table
    for (int row = 0; row < ticketSales.length; row++)   // each row
    {
        for (int col = 0; col < ticketSales[row].length; col++)   // each column
        {
            if (ticketSales[row][col] > highest)         // newcomer on the left
            {
                highest = ticketSales[row][col];         // keep the VALUE
            }
        }
    }
    return highest;                                // after both loops
       
    }

    @Override
    public int LowestSale(int[][] ticketSales) {
         int lowest = ticketSales[0][0];                      // start with the first value (NOT 0)
    for (int row = 0; row < ticketSales.length; row++)   // each row
    {
        for (int col = 0; col < ticketSales[row].length; col++)   // each column
        {
            if (ticketSales[row][col] < lowest)          // < for the lowest
            {
                lowest = ticketSales[row][col];          // keep the VALUE
            }
        }
    }
    return lowest;
    }
    
}
