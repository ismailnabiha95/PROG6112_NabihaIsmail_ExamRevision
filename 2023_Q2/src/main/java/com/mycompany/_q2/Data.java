/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._q2;

/**
 *
 * @author ismai
 */
public class Data {
    private String location;       // private fields
    private String name;
    private double price;
    private double commission;

    public Data()                  // empty constructor
    {
    }

    public String getLocation() { return location; }                          // getter: returns the value
    public void setLocation(String location) { this.location = location; }   // setter: stores a value
    // same pattern for name (String), price (double) and commission (double)

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getCommission() {
        return commission;
    }
    
    public void setName(String name) { this.name = name; }                      // setter: stores the name
public void setPrice(double price) { this.price = price; }                  // price is a double
public void setCommission(double commission) { this.commission = commission; }   // commission is a double
    
}


