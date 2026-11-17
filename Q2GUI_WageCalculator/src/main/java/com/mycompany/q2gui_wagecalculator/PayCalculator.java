/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2gui_wagecalculator;

/**
 *
 * @author ismai
 */
public class PayCalculator implements IPayCalculator {

    @Override
    public double CalculatePay(double hours, double rate) {
       double pay;                               // set in both branches below

        if (hours > 40)                         // overtime starts after how many hours?
        {
            // 40 normal hours, plus the extra hours at one and a half times the rate
            pay = (40 * rate) + ((hours - 40) * rate * 1.5);   // what multiplier is "one and a half times"?
        }
        else
        {
            pay = hours * rate;                   // no overtime
        }

        return pay;   
    }
    
}
