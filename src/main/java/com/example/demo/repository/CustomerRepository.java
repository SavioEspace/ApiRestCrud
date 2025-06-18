// CustomerRepository.java
package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório de acesso a dados para Cliente.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
