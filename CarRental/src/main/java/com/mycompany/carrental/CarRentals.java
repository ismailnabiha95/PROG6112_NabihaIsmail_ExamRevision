package com.mycompany.carrental;


public class CarRentals implements ICarRental{
    

    private static final double VAT_RATE = 0.15;   // 15% VAT

@Override
public double CalculateTotalRentalPrice(int numberOfDays, double dailyRate)
{
    double subtotal = numberOfDays * dailyRate;       // price before VAT
    double total = subtotal + (subtotal * VAT_RATE);  // add 15% VAT
    return total;
}

    @Override
public boolean ValidateData(CarRentalData data) {
    if (data.getCarName() == null || data.getCarName().isEmpty()) {
        return false;                    // car name cannot be empty
    }
    if (data.getDailyRate() <= 0) {
        return false;                    // rate cannot be <= 0
    }
    if (data.getNumberOfDays() <= 0) {
        return false;                    // days cannot be <= 0
    }
    return true;                         // all rules passed
}
    
}
