package com.mycompany.taxitrips_q1exam;


public class TaxiTrips implements ITaxiTrips
{

    @Override
    public int TotalTrips(int[] driverTrips)
    {
          int total = 0;                                   // before the loop
      for (int i = 0; i < driverTrips.length; i++)
{
    total = total + driverTrips[i];
}
return total;   // total, not i
 }

    
    @Override
    public double AverageTrips(int[][] trips)
    {
        int sum = 0;
    int count = 0;
  for (int row = 0; row < trips.length; row++)
{
    for (int col = 0; col < trips[row].length; col++)
    {
        sum = sum + trips[row][col];
        count++;
    }
}
return (double) sum / count;
    }

    @Override
    public String TopDriver(String[] drivers, int[] totalTrips)
    {
        int best = 0;
for (int i = 1; i < totalTrips.length; i++)
{
    if (totalTrips[i] > totalTrips[best])
    {
        best = i;
    }
}
return drivers[best];                            // the name, not the number
    }
    
}
