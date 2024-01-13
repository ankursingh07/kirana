package com.assignment.kirana.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "orderDetails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdersEntity {

    @Id
    @Column(name = "orderId", unique = true)
    @SequenceGenerator(name = "SQ_GEN", sequenceName = "order-details-seq-gen", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_GEN")
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
