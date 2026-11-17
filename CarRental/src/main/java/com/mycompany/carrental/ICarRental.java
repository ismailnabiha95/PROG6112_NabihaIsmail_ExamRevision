package com.mycompany.carrental;


public interface ICarRental {
    
     double CalculateTotalRentalPrice(int numberOfDays, double dailyRate);
    boolean ValidateData(CarRentalData carRentalData);
    
}
