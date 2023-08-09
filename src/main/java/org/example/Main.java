package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/8/2023 11:18
 */

public class Main {
    private static PaymentTerminal terminal;

    public static void main(String[] args) {
        terminal = new PaymentTerminal();

        System.out.println("Client 1 wants to pay in PayPal:");
        terminal.setPaymentMethod(new PayPal());
        terminal.receivePayment();

        System.out.println("Client 2 wants to pay in Bitcoin:");
        terminal.setPaymentMethod(new Bitcoin());
        terminal.receivePayment();

        System.out.println("Client 3 wants to pay in Credit Card:");
        terminal.setPaymentMethod(new CreditCard());
        terminal.receivePayment();
    }
}