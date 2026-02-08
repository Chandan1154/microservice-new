package com.localprogramer.order_service.repository;

import com.localprogramer.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderRepository extends JpaRepository<Order, Long> {
}
