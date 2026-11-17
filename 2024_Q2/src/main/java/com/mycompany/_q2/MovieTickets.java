/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._q2;

/**
 *
 * @author ismai
 */
public class MovieTickets implements IMovieTickets
               
        
{

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        
        double subtotal = numberOfTickets * ticketPrice;   // tickets times price: which operator?
        double vat = subtotal * 0.14;                     // VAT in this paper is what percent, as a decimal?
        return subtotal + vat;                            // the total includes the VAT
        
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        
        // rule 1: the movie name cannot be empty
        if (movieTicketData.getMovieName().trim().isEmpty())   
        {
            return false;                                 // invalid
        }

        // rule 2: the ticket price cannot be zero or less
        if (movieTicketData.getTicketPrice() <= 0)    
        {
            return false;                                 // invalid
        }

        // rule 3: the number of tickets cannot be zero or less
        if (movieTicketData.getNumberOfTickets() <= 0)    // zero or less
        {
            return false;                                 // invalid
        }

        return true;                                      // all three rules passed
    }
    }
    

