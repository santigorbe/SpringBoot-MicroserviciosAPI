package com.gorbea.ecommerce.payment;

import com.gorbea.ecommerce.customer.CustomerResponse;
import com.gorbea.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
