package com.mycompany.q1;


public class App {

    public static void main(String[] args) {
       
        String [] Years = {"Year 1","Year 2"};
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        int[][] sales = { {300, 150, 700}, {250, 200, 600} };          // row = year, column = quarter
       ProductSales productSales = new ProductSales();                // object 
    
    
       System.out.println("Product Sales Report - 2026");    // 1. title
       System.out.println("--------------------");    //    dashes
       
      System.out.print("        ");              // 2. heading: space for the label column
    for (int col = 0; col < quarters.length; col++)    // one pass per heading
    {
        System.out.print(quarters[col] + " ");    // print: stay on the line
    }
    System.out.println();                          // end the heading line
    
     for (int row = 0; row < Years.length; row++)   // 3. rows: outer loop = lines
    {
        System.out.print(Years[row] + ": ");    // the label for the CURRENT row
        for (int col = 0; col < sales[row].length; col++)  // inner loop = values across
        {
            System.out.print(sales[row][col] + "       ");   // stay on the line
        }
        System.out.println();                      // end THIS row, after the inner loop
    }
     
     // summary: every number comes from a method call
    System.out.println("\nTotal sales:   " + productSales.TotalSales(sales));
    System.out.println("Average sales: " + Math.round(productSales.AverageSales(sales)));
    System.out.println("Highest sale:  " + productSales.MaxSale(sales));
    System.out.println("Lowest sale:   " + productSales.MinSale(sales));
    }//main
}//class
