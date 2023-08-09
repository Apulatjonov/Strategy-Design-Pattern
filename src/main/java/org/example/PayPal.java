package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/8/2023 11:20
 */

public class PayPal implements PaymentMethod{
    @Override
    public void processPayment() {
//        logic for PayPal payment
        System.out.println("Payment in PayPal!");
    }
}
