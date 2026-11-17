
package com.mycompany.temperatures_act3;


public class Temperatures implements ITemperatures{

   @Override
public int HighestTemperature(int[][] temps)
{
    int highest = temps[0][0];                       // the first value in the table

    for (int row = 0; row < temps.length; row++)            // each row (each city)
    {
        for (int col = 0; col < temps[row].length; col++)   // each column (each day)
        {
            if (temps[row][col] > highest)               // newcomer vs the highest so far
            {
                highest = temps[row][col];               // keep the VALUE
            }
        }
    }

    return highest;
}

    @Override
    public int LowestTemperature(int[][] temps) {
        int lowest = temps[0][0];                       // the first value in the table

    for (int row = 0; row < temps.length; row++)            // each row (each city)
    {
        for (int col = 0; col < temps[row].length; col++)   // each column (each day)
        {
            if (temps[row][col] < lowest)               // newcomer vs the highest so far
            {
                lowest = temps[row][col];               // keep the VALUE
            }
        }
    }

    return lowest;
    }

   @Override
public int ColdDays(int[][] temps, int limit)
{
    int count = 0;                                        // 1. before the loops

    for (int row = 0; row < temps.length; row++)               // 2. each row (each city)
    {
        for (int col = 0; col < temps[row].length; col++)   // 3. each column (each day)
        {
            if (temps[row][col] < limit)                  // 4. the value, and the comparison
            {
                count = count + 1;                        // 5. add how much?
            }
        }
    }

    return count;                                             // 6. after both loops
}
    
}
