package com.assignment.kirana.persistence.repository;

import com.assignment.kirana.persistence.entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Time;
import java.util.Optional;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Long> {

    public Optional<OrdersEntity> findByOrderId(long orderId);

    public Optional<OrdersEntity> findByTimeIsBetween(Time from, Time to);
}
