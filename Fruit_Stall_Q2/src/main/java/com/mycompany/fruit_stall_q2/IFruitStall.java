
package com.mycompany.fruit_stall_q2;


public interface IFruitStall {
     int[] WeeklyTotals(int[][] sales);
    int BestWeek(int[] weeklyTotals);
    int WeeksOverTarget(int[] weeklyTotals, int target);
    
}
