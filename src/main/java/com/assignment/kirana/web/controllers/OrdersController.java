package com.assignment.kirana.web.controllers;

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
    public Long addOrders(@Valid @RequestBody OrdersDTO ordersDTO) {
        log.info("orderDTO = {}", ordersDTO.toString());
        ordersService.addOrder(ordersDTO);
        return 7L;
    }

    @GetMapping
    public Iterable<OrdersEntity> getOrders() {
        return ordersService.getOrders();
    }
}
