
package com.mycompany.q1;


public class MovieTickets implements IMovieTickets {

    // returns the total tickets sold for one movie
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
       int sum = 0;                                                // start at 0, BEFORE the loop

    for (int i = 0; i < movieTicketSales.length; i++)                     // visit every item
    {
        sum = sum + movieTicketSales[i];                                  // add the current item
    }

    return sum;
        
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
         int best = 0;                                               // the first position is the best so far

    for (int i = 1; i < totalSales.length; i++)                     // check the rest
    {
        if (totalSales[i] > totalSales[best])   // compare the sales totals, newcomer on the left                     // compare the numbers
        {
            best = i;                                           // keep the position
        }
    }

    return movies[best];                                         // look up the label at that position
       
    }
    
}
