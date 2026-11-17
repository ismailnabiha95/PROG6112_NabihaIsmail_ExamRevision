package com.mycompany.fruit_stall_q2;

public class Fruit_Stall_Q2 {

    public static void main(String[] args) {

        // the data: week labels, fruit names, and the sales table (rows = fruits, columns = weeks)
        String[] weeks = {"Week 1", "Week 2", "Week 3", "Week 4"};
        String[] fruits = {"Apples", "Bananas", "Oranges"};
        int[][] sales = {{30, 25, 40, 35},
                         {20, 30, 22, 15},
                         {15, 20, 10, 35}};

        // create the object and get the total sales for each week
        FruitStall stall = new FruitStall();
        int[] weeklyTotals = stall.WeeklyTotals(sales);

        // heading
        System.out.println("FRUIT STALL REPORT");
        System.out.println("------------------");

        // one line per fruit: the name, then its sales for each week
        for (int row = 0; row < fruits.length; row++)
        {
            System.out.print(fruits[row] + ": ");
            for (int col = 0; col < sales[row].length; col++)
            {
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();   // end the line after each fruit
        }

        System.out.println("------------------");

        // one line per week: the label and its total
        for (int i = 0; i < weeklyTotals.length; i++)   // fixed: one pass per week
        {
            System.out.println(weeks[i] + " total: " + weeklyTotals[i]);
        }

        System.out.println("------------------");

        // best week and number of weeks over the target of 70
        System.out.println("Best week: " + stall.BestWeek(weeklyTotals));
        System.out.println("Weeks over 70: " + stall.WeeksOverTarget(weeklyTotals, 70));
    }
}