package com.mycompany.q1;                                    // must match the package of MovieTickets and IMovieTickets

public class App {

    public static void main(String[] args) {

        // ---------- 1. the data ----------
        String[] movieNames = {"Napoleon", "Oppenheimer"};   // movie names, one per row
        String[] months = {"JAN", "FEB", "MAR"};             // month headings, one per column
        int[][] sales = { {3000, 1500, 1700},                // Napoleon: JAN, FEB, MAR
                          {3500, 1200, 1600} };              // Oppenheimer: JAN, FEB, MAR

        int[] totals = new int[movieNames.length];           // one box per movie for the totals

        MovieTickets tickets = new MovieTickets();           // object that does the calculations

        // ---------- 2. fill the totals, one row at a time ----------
        for (int row = 0; row < sales.length; row++)         // one pass per movie
        {
            totals[row] = tickets.TotalMovieSales(sales[row]);   // pass the whole row for this movie
        }

        // ---------- 3. the report heading ----------
        System.out.println("MOVIE TICKET SALES REPORT - 2024");   // title from the paper
        System.out.println();                                // blank line

        System.out.print("              ");                  // space for the movie name column
        for (int col = 0; col < months.length; col++)        // one pass per month
        {
            System.out.print(months[col] + "   ");           // month heading, stay on the same line
        }
        System.out.println();                                // end the heading line

        System.out.println("------------------------------------------");   // dashed line under the heading

        // ---------- 4. the table, one row per movie ----------
        for (int row = 0; row < sales.length; row++)         // outer loop: one pass per movie
        {
            System.out.print(movieNames[row] + "   ");       // the name for the CURRENT row, stay on the line

            for (int col = 0; col < sales[row].length; col++)    // inner loop: each month in THIS row
            {
                System.out.print(sales[row][col] + "   ");   // the value and spaces, stay on the line
            }

            System.out.println();                            // end the row AFTER the inner loop
        }

        // ---------- 5. the total for each movie ----------
        System.out.println();                                // blank line before the totals
        for (int row = 0; row < movieNames.length; row++)    // one line per movie
        {
            System.out.println("Total movie ticket sales for " + movieNames[row] + " " + totals[row]);   // name and total share the same index
        }

        // ---------- 6. the top performing movie ----------
        System.out.println();                                // blank line before the last line
        System.out.println("Top performing movie: " + tickets.TopMovie(movieNames, totals));   // names array first, then totals
    }
}