package com.assignment.kirana.persistence.repository;

import com.assignment.kirana.persistence.entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Long> {

    Optional<OrdersEntity> findByOrderId(long orderId);

    Optional<OrdersEntity> findByTimeIsBetween(Time from, Time to);

    Iterable<OrdersEntity> findByDateIsBetween(Date from,  Date to);
}
