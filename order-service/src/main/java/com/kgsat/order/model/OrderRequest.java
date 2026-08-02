package com.kgsat.order.model;
import jakarta.validation.constraints.*; import java.math.BigDecimal;
public record OrderRequest(@NotBlank String customerId,@NotNull @Positive BigDecimal amount, boolean simulateFailure) {}
