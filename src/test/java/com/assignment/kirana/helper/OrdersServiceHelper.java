package com.assignment.kirana.helper;

import com.assignment.kirana.dto.OrdersDTO;
import com.assignment.kirana.external.dto.FxRatesGetResponse;
import com.assignment.kirana.persistence.entity.OrdersEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.mockito.internal.util.collections.Iterables;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

public class OrdersServiceHelper {

    public static OrdersEntity getMockedOrdersEntity() {
        OrdersEntity order = new OrdersEntity();
        order.setOrderId(7);
        order.setBuyer("test");
        order.setItem("test_item");
        order.setNumberOfItems(7);
        order.setCostOfSingleItem(7);
        order.setCurrency("INR");
        order.setTotalCost(order.getCostOfSingleItem() * order.getNumberOfItems());
        order.setDate(Date.valueOf(LocalDate.now()));
        order.setTime(Time.valueOf(LocalTime.now()));
        return order;
    }

    public static OrdersDTO getMockedOrderDTO() {
        return OrdersDTO.builder()
                .orderId(7)
                .buyer("test")
                .item("test-item")
                .numberOfItems(7)
                .costOfSingleItem(7)
                .currency("INR")
                .build();
    }
}
