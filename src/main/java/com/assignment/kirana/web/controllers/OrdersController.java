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

/** This is used for the purpose of dealing with the orders made on this Kirana Platform*/
@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    /** @return The following API is used to add an order into the database and it returns the order number associated with the particular order*/
    @PostMapping(value = "/insert", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public String addOrders(@Valid @RequestBody OrdersDTO ordersDTO) {

        log.info("orderDTO = {}", ordersDTO.toString());
        long orderId = ordersService.addOrder(ordersDTO);
        String order = "Order id is = " + orderId;
        return order;
    }

    /** @return The following API is used to fetch all the orders till date */
    @GetMapping(value = "/all",produces = APPLICATION_JSON_VALUE)
    public Iterable<OrdersEntity> getOrders() {
        return ordersService.getOrders();
    }

    /** @return The following API is used to fetch the orders for a fixed period of date */
    @PostMapping(value = "/inbetween",consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Iterable<OrdersEntity> getOrdersForDateInBetween(@Valid @RequestBody DateInBetweenDTO dateInBetweenDTO) {
        log.info("dateInBetweenDTO = {}", dateInBetweenDTO.toString());
        return ordersService.getOrdersForDateInBetween(dateInBetweenDTO);
    }
}
