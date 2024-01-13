package com.assignment.kirana.service;

import com.assignment.kirana.dto.DateInBetweenDTO;
import com.assignment.kirana.dto.OrdersDTO;
import com.assignment.kirana.external.api.FxRatesApi;
import com.assignment.kirana.external.dto.FxRatesGetResponse;
import com.assignment.kirana.persistence.entity.OrdersEntity;
import com.assignment.kirana.persistence.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrdersService {

    private final OrdersRepository ordersRepository;
    private final FxRatesApi fxRatesApi;
    public long addOrder(OrdersDTO ordersDTO) {
        log.info("The details to be added are: {}", ordersDTO);
        OrdersEntity order = new OrdersEntity();
        order.setOrderId(ordersDTO.orderId());
        order.setBuyer(ordersDTO.buyer());
        order.setItem(ordersDTO.item());
        order.setNumberOfItems(ordersDTO.numberOfItems());
        if (ordersDTO.currency().equalsIgnoreCase("INR")) {
            order.setCostOfSingleItem(ordersDTO.costOfSingleItem());
        } else {
            FxRatesGetResponse response = fxRatesApi.conversionGet();
            double inrConversionRate = response.rates().inr();
            double costInINR = ordersDTO.costOfSingleItem() * inrConversionRate;
            order.setCostOfSingleItem(costInINR);
        }
        order.setCurrency("INR");
        order.setTotalCost(order.getCostOfSingleItem() * order.getNumberOfItems());
        ordersRepository.save(order);
        log.info("Successfully saved the order data");
        return order.getOrderId();
    }

    public Iterable<OrdersEntity> getOrders() {
        log.info("Fetching all orders...");
        Iterable<OrdersEntity> orders = ordersRepository.findAll();
        log.info("Returning the fetched data!");
        return orders;
    }

    public Iterable<OrdersEntity> getOrdersForDateInBetween(DateInBetweenDTO dateInBetweenDTO) {
        log.info("Fetching all orders...");
        Iterable<OrdersEntity> orders = ordersRepository.findByDateIsBetween(dateInBetweenDTO.from(),dateInBetweenDTO.to());
        log.info("Returning the fetched data!");
        return orders;
    }
}
