package com.mycompany.temperatures_act3;

public class Temperatures_Act3
{
    public static void main(String[] args)
    {
        // the data: town names, day labels and the temperature table (rows = towns, columns = days)
        String[] towns = {"Durban", "Joburg", "Welkom"};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI"};
        int[][] temps = { {24, 26, 28, 25, 23},
                          {18, 21, 16, 14, 19},
                          {12, 9, 15, 22, 8} };

        // create the object so we can call its methods
        Temperatures temperature = new Temperatures();

        // heading
        System.out.println("TEMPERATURE REPORT");
        System.out.println("------------------");

        // the day labels on one line
        System.out.print("DAYS: ");
        for (int col = 0; col < days.length; col++)
        {
            System.out.print(days[col] + " ");
        }
        System.out.println();                       // end the days line

        // one line per town: the name, then its temperature for each day
        for (int row = 0; row < towns.length; row++)
        {
            System.out.print(towns[row] + ": ");
            for (int col = 0; col < temps[row].length; col++)
            {
                System.out.print(temps[row][col] + " ");
            }
            System.out.println();                   // end the line after each town
        }

        System.out.println("------------------");

        // call the methods and print the results
        System.out.println("Highest: " + temperature.HighestTemperature(temps));
        System.out.println("Lowest: " + temperature.LowestTemperature(temps));
        System.out.println("Days below 10: " + temperature.ColdDays(temps, 10));

    }//main
}//class