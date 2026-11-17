package com.mycompany.hotel_revenue_q5;


public class Hotel_Revenue_Q5 {

    public static void main(String[] args) {
        
        // the data: room types, nights booked per week, and the price per night for each type
String[] roomTypes = {"Single", "Double", "Suite"};
int[][] nights = { {10, 12, 9, 11},                              // row 0: Single
                   { 8,6,9,7},                         // row 1: Double
                   { 3,4,2,5} };                       // row 2: Suite
double[] prices = {500, 850, 1500};                               // price per night, same order as roomTypes

Hotel hotel = new Hotel();                                       // object to call the methods on
double[] revenues = new double[roomTypes.length];                   // one box per room type, NOT {}

// heading
System.out.println("HOTEL REVENUE REPORT");                      // title line
System.out.println("--------------------");                      // dashed line

// calculate each room type's revenue
for (int row = 0; row < roomTypes.length; row++)                 // one pass per room type
{
    revenues[row] = hotel.Revenue(nights[row], prices[row]);     // this room type's nights row and its own price
}

// print each room type and its revenue
for (int row = 0; row < roomTypes.length; row++)                 // one line per room type
{
    System.out.printf("%s: R%.2f%n", roomTypes[row], revenues[row]);   // the name, then the REVENUE (not the price)
}

// summary
System.out.println("--------------------");
System.out.printf("Total revenue: R%.2f%n", hotel.TotalRevenue(revenues));     // method name, its argument
System.out.println("Top earner: " + hotel.TopEarner(roomTypes,revenues));       // method name, its two arguments
    }
}
