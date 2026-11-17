
package com.mycompany.hotel_revenue_q5;


public interface IHotel 
{
    double Revenue(int[] nights, double pricePerNight);                 // one room type's nights and price in, its revenue out
    double TotalRevenue(double[] revenues);                             // all the revenues in, their sum out
    String TopEarner(String[] roomTypes, double[] revenues);            // names and revenues in, the best name out
}
