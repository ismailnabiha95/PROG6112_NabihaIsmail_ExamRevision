

package com.mycompany.q2;


public class App {

    public static void main(String[] args) {
        // ===== Q2.1: the single array for the provinces (5 marks) =====
        String[] provinces = {"Gauteng", "Natal", "Cape"};   // 1D array of names

        // ===== Q2.1: the 2D array for the prices (5 marks) =====
        // row = province, column = property type (flat, town house, house)
        int[][] prices = {
            {800000, 1500000, 2000000},   // Gauteng
            {700000, 1200000, 1600000},   // Natal
            {750000, 1300000, 1800000}    // Cape
        };

        // ===== Print the table (heading, dashes, rows) =====
        System.out.println("            FLAT           TOWN HOUSE          HOUSE");
        System.out.println("------------------------------------------------------------");

        for (int row = 0; row < prices.length; row++)               // outer loop = province
        {
            System.out.print(provinces[row] + "        ");          // name, stays on the line
            for (int col = 0; col < prices[row].length; col++)      // inner loop = property type
            {
                System.out.print("R " + prices[row][col] + "        ");   // one price
            }
            System.out.println();                                   // new line after each province
        }
        System.out.println();                                       // blank line

        // ===== Q2.2: average per province (5 marks calculate, 5 marks print) =====
        for (int row = 0; row < prices.length; row++)
        {
            int total = 0;                                          // INSIDE the outer loop: restarts for each province
            for (int col = 0; col < prices[row].length; col++)
            {
                total = total + prices[row][col];                   // add the 3 prices
            }
            int average = total / prices[row].length;               // divide by 3 (the number of columns)

            System.out.print("Average property prices in " + provinces[row] + " = R ");
            System.out.printf("%,d", average);                      // %,d puts commas in the number
            System.out.println();                                   // new line
        }
    }
}
