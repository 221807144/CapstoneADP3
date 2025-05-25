package za.ac.cput.Factory.payment;

import za.ac.cput.Domain.payment.Payments;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

public class PaymentFactory {

    public static Payments createPayments(String paymentMethod, String paymentDetails, double paymentAmount, LocalDate paymentDate) {

        if(Helper.isNullOrEmpty(paymentMethod) || Helper.isNullOrEmpty(paymentDetails) || Helper.isNullOrEmpty(String.valueOf(paymentAmount)) || Helper.isNullOrEmpty(String.valueOf(paymentDate))) {
            return null;
        }
        int paymentId = Helper.generateUniqueId();

        return new Payments.Builder()
                .setPaymentId(paymentId)
                .setPaymentMethod(paymentMethod)
                .setPaymentDetails(paymentDetails)
                .setPaymentAmount(paymentAmount)
                .setPaymentDate(paymentDate)
                .build();
    }

}
