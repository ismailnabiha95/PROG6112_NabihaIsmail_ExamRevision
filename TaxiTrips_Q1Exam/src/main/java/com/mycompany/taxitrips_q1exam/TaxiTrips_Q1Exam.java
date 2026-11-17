package com.mycompany.taxitrips_q1exam;


public class TaxiTrips_Q1Exam
{
   

    public static void main(String[] args)
    {
       // Step 7: the data and the object
        String[] drivers = {"Thabo", "Lerato", "Sipho"};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI"};
        int[][] trips = { {8, 10, 7, 12, 9},
                          {11, 9, 13, 8, 10},
                          {6, 12, 9, 7, 14} };

        TaxiTrips taxi = new TaxiTrips();                 // the object that does the calculations
        int[] totals = new int[drivers.length];           // one total per driver

        // Step 8: heading and rows
        System.out.println("TAXI TRIPS REPORT - WEEK 46");
        System.out.println();

        System.out.print("\t");                            // empty space above the names
        for (int col = 0; col < days.length; col++)
        {
            System.out.print(days[col] + "\t");           // MON TUE WED THU FRI
        }
        System.out.println();
        System.out.println("------------------------------------------------");

        for (int row = 0; row < trips.length; row++)
        {
            System.out.print(drivers[row] + "\t");        // the name first
            for (int col = 0; col < trips[row].length; col++)
            {
                System.out.print(trips[row][col] + "\t"); // print, not println
            }
            System.out.println();                         // one new line per driver
            totals[row] = taxi.TotalTrips(trips[row]);    // total for this driver
        }

        // Step 9: totals, average and top driver
        System.out.println();
        for (int i = 0; i < drivers.length; i++)
        {
            System.out.println("Total trips for " + drivers[i] + ": " + totals[i]);
        }

        System.out.println();
        System.out.printf("Average trips per driver per day: %.2f%n", taxi.AverageTrips(trips));

        System.out.println();
        System.out.println("Top performing driver: " + taxi.TopDriver(drivers, totals));
    }//main
}//class
