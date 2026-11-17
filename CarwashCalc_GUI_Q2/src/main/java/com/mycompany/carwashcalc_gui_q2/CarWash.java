
package com.mycompany.carwashcalc_gui_q2;


public class CarWash implements ICarWash {

    @Override
    public double GetPrice(String vehicleType) {
       // compare Strings with equals, never ==
        if (vehicleType.equals("Sedan"))
        {
            return 80;                          // Sedan price from the paper
        }
        else if (vehicleType.equals("SUV"))
        {
            return 120;                          // SUV price from the paper
        }
        else if (vehicleType.equals("Truck"))
        {
            return 180;                          // Truck price from the paper
        }
        else
        {
            return 0;                             // unknown type: no price
        }
        
        
    }

    @Override
    public double CalculateSubtotal(double price, int quantity) {
       return price * quantity;
    }

    @Override
    public double CalculateDiscount(double subtotal, int quantity, boolean isMember) {
        
        double rate;                              // the discount rate, set by the chain below

        // most specific condition FIRST
        if (isMember && quantity >= 5)          // member AND 5 or more: which comparison?
        {
            rate = 0.15;                          // 15%
        }
        else if (isMember)                        // member only
        {
            rate = 0.10;                          // 10% as a decimal
        }
        else if (quantity >= 5)                   // 5 or more, not a member
        {
            rate = 0.05;                          // 5%
        }
        else
        {
            rate = 0;                             // no discount
        }

        return subtotal * rate;                   // the discount in rand, not the rate
        
    }

    @Override
    public double CalculateVat(double amountAfterDiscount) {
        
        return amountAfterDiscount * 0.15;        // VAT is 15% of the amount AFTER the discount
    }

    @Override
    public double CalculateTotal(double subtotal, double discount) {
        double amountAfterDiscount = subtotal - discount;   // take the discount off first
        double vat = CalculateVat(amountAfterDiscount);        // VAT on the reduced amount
        return amountAfterDiscount + vat;                      // total due includes the VAT
    }
    
}
