// OrderRepository.java
package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório de acesso a dados para Pedido.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
