package com.mycompany.temperatures_act3;


public interface ITemperatures {
     int HighestTemperature(int[][] temps);
    int LowestTemperature(int[][] temps);
    int ColdDays(int[][] temps, int limit);
}
