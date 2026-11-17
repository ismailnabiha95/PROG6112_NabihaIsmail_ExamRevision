package com.mycompany.hotel_revenue_q5;     

public class Hotel implements IHotel
{
    @Override
    public double Revenue(int[] nights, double pricePerNight)
    {
        int totalNights = 0;                                    // start at 0 before the loop

        for (int i = 0; i < nights.length; i++)                 // visit every week's nights
        {
            totalNights = totalNights + nights[i];              // add this week to the total
        }

        return totalNights * pricePerNight;                     // total nights x price (int x double gives a double)
    }

    @Override
    public double TotalRevenue(double[] revenues)
    {
        double total = 0.0;                                     // start at 0 before the loop

        for (int i = 0; i < revenues.length; i++)               // visit every room type's revenue
        {
            total = total + revenues[i];                        // add it to the running total
        }

        return total;                                           // after the loop
    }

    @Override
    public String TopEarner(String[] roomTypes, double[] revenues)
    {
        int best = 0;                                           // the first room type is best so far

        for (int i = 1; i < revenues.length; i++)               // start at 1, as position 0 is already the best
        {
            if (revenues[i] > revenues[best])                   // newcomer on the left, best so far on the right
            {
                best = i;                                       // remember the new position
            }
        }

        return roomTypes[best];                                 // look up the NAME at the best position
    }
}