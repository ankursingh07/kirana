package com.assignment.kirana.web.controllers;

import com.assignment.kirana.dto.DateInBetweenDTO;
import com.assignment.kirana.dto.OrdersDTO;
import com.assignment.kirana.persistence.entity.OrdersEntity;
import com.assignment.kirana.service.OrdersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public long addOrders(@Valid @RequestBody OrdersDTO ordersDTO) {
        log.info("orderDTO = {}", ordersDTO.toString());
        long orderId = ordersService.addOrder(ordersDTO);
        return orderId;
    }
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public Iterable<OrdersEntity> getOrders() {
        return ordersService.getOrders();
    }

    @PostMapping(value = "/inbetween",consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Iterable<OrdersEntity> getOrdersForDateInBetween(@Valid @RequestBody DateInBetweenDTO dateInBetweenDTO) {
        log.info("dateInBetweenDTO = {}", dateInBetweenDTO.toString());
        return ordersService.getOrdersForDateInBetween(dateInBetweenDTO);
    }
}
