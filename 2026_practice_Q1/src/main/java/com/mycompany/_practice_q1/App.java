

package com.mycompany._practice_q1;


public class App {
    

    public static void main(String[] args) {
        
        TicketSales ticketSales = new TicketSales();      // object of your class
        
        String [] Years = {"Year1","Year2"};
        String[] Seasons ={"Summer","Autumn","Winter","Spring"};
        int sales [][]={{ 420 ,310, 180 ,390},{ 450 ,280, 220, 390}};
        
        
        System.out.println("Theatre Ticket Sales Report - 2026");    // 1. title
    System.out.println("--------------------");    //    dashes

    System.out.print("      ");                    // 2. heading: space for the label column
    for (int col = 0; col < Seasons.length; col++)    // one pass per heading
    {
        System.out.print(Seasons[col] + " ");     // print: stay on the line
    }
    System.out.println();      // end the heading line
    
    for (int row = 0; row < Years.length; row++)   // 3. rows: outer loop = lines
    {
        System.out.print(Years[row] + ": ");    // the label for the CURRENT row
        for (int col = 0; col < sales[row].length; col++)  // inner loop = values across
        {
            System.out.print(sales[row][col] + " ");   // stay on the line
        }
        System.out.println();                      // end THIS row, after the inner loop
    }

    System.out.println("----------------------------------------------");    // closing dashed line

// summary: every number comes from a method call
System.out.println("Total tickets sold:   " + ticketSales.TotalTicketSales(sales));
System.out.println("Average per season:   " + Math.round(ticketSales.AverageTicketSales(sales)));   // whole number: 330
System.out.println("Highest season:       " + ticketSales.HighestSale(sales));
System.out.println("Lowest season:        " + ticketSales.LowestSale(sales));
    
    
    
    }//main
}//class
