package com.gorbea.ecommerce.kafka;

import com.gorbea.ecommerce.customer.CustomerResponse;
import com.gorbea.ecommerce.order.PaymentMethod;
import com.gorbea.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
