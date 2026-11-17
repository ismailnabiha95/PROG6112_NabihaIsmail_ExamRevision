package com.mycompany.taxitrips_q1exam;


public interface ITaxiTrips 
{
     int TotalTrips(int[] driverTrips);
    double AverageTrips(int[][] trips);
    String TopDriver(String[] drivers, int[] totalTrips);
}
