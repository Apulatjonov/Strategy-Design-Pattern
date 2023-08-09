package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/8/2023 11:18
 */

public class PaymentTerminal {
    private PaymentMethod method;

    public void setPaymentMethod(PaymentMethod method){
        this.method = method;
    }

    public void receivePayment(){
        method.processPayment();
    }

}
