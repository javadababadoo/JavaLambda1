/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambda;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author PC
 */
public class Test {

    private static BigDecimal mensualInterestRate = new BigDecimal(0.81 / 100l);

    private static BigDecimal fixedFee = new BigDecimal(2000000);

    private int feesNumber = 0;

    public static void main(String[] args) {
        BigDecimal loan = new BigDecimal(100000000);
        System.out.println(currencyFormat(loan));
        Test test = new Test();
        test.calculateFee(loan);
    }

    public void calculateFee(BigDecimal debt) {
        BigDecimal interestRate = debt.multiply(mensualInterestRate);
        BigDecimal investment = fixedFee.subtract(interestRate);
        debt = investment.doubleValue() > debt.doubleValue()?debt.subtract(debt):debt.subtract(investment);
        
        if (debt.doubleValue() > 0) {
            feesNumber = feesNumber + 1;
            System.out.println("Debt: " + currencyFormat(debt) + " - Interest rate: " + currencyFormat(interestRate)+ " - Capital: "+ currencyFormat(investment.doubleValue() > debt.doubleValue() ? debt.add(interestRate):investment ));
            calculateFee(debt);
        } else {
            System.out.println("Debt: " + currencyFormat(debt) + " - Interest rate: " + 0+ " - Capital: "+  0);
            System.out.println("Fees number: " + feesNumber);
        }
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }

}
