
package com.mycompany.fruit_stall_q2;


public class FruitStall implements IFruitStall {

   @Override
public int[] WeeklyTotals(int[][] sales)
{
    int[] totals = new int[sales[0].length];         // 4 weeks = 4 spaces

    for (int col = 0; col < sales[0].length; col++)  // outer loop: each week
    {
        int weekTotal = 0;                           // restart for every week
        for (int row = 0; row < sales.length; row++) // inner loop: each fruit
        {
            weekTotal = weekTotal + sales[row][col];
        }
        totals[col] = weekTotal;                     // store this week's total
    }

    return totals;
}

   @Override
public int BestWeek(int[] weeklyTotals)
{
    int best = 0;

    for (int i = 1; i < weeklyTotals.length; i++)
    {
        if (weeklyTotals[i] > weeklyTotals[best])
        {
            best = i;
        }
    }

    return best+1;
}

   @Override
public int WeeksOverTarget(int[] weeklyTotals, int target)
{
    int count = 0;

    for (int i = 0; i < weeklyTotals.length; i++)
    {
        if (weeklyTotals[i] > target)
        {
            count = count + 1;
        }
    }

    return count;
}
}
