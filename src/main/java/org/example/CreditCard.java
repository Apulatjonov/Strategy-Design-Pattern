package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/8/2023 11:19
 */

public class CreditCard implements PaymentMethod{
    @Override
    public void processPayment() {
//        logic for Credit Card payment
        System.out.println("Payment in Credit Card!");
    }
}
