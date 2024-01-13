package com.assignment.kirana.persistence.repository;

import com.assignment.kirana.persistence.entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Long> {
    Iterable<OrdersEntity> findByDateIsBetween(Date from,  Date to);
}
