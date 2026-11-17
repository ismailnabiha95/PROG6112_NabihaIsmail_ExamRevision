package com.mycompany.carrental;

// holds the data captured from the form
public class CarRentalData {
    private String carName;
    private int numberOfDays;
    private double dailyRate;

    // empty constructor so the object can be created with new CarRentalData()
    public CarRentalData() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}