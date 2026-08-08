package com.kgsat.order.model;
import java.math.BigDecimal; import java.time.Instant;
public record OrderEvent(String orderId,String customerId,BigDecimal amount,boolean simulateFailure,Instant createdAt) {}
