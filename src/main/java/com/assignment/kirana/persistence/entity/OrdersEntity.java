package com.assignment.kirana.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "order-details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdersEntity {

    @Id
    @Column(name = "orderId", unique = true)
    private long orderId;

    @Column(name = "buyer")
    private String buyer;

    @Column(name = "item")
    private String item;

    @Column(name = "numberOfItems")
    private long numberOfItems;

    @Column(name = "costOfSingleItem")
    private double costOfSingleItem;

    @Column(name = "currency")
    private String currency;

    @Column(name = "totalCost")
    private double totalCost;

    @Column(name = "date")
    private Date date = Date.valueOf(LocalDate.now());

    @Column(name = "time")
    private Time time = Time.valueOf(LocalTime.now());

}
