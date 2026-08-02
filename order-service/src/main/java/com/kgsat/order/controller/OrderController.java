package com.kgsat.order.controller;
import com.kgsat.order.model.*; import com.kgsat.order.service.OrderService; import jakarta.validation.Valid; import org.springframework.http.*; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/orders") public class OrderController { private final OrderService service; public OrderController(OrderService service){this.service=service;} @PostMapping public ResponseEntity<OrderEvent> create(@Valid @RequestBody OrderRequest request){return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.create(request));} }
