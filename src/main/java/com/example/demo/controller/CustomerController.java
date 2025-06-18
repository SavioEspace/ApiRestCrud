package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para operações de cliente.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Retorna todos os clientes cadastrados.
     */
    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    /**
     * Retorna um cliente pelo seu ID.
     */
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    /**
     * Cadastra um novo cliente.
     */
    @PostMapping
    public Customer save(@Valid @RequestBody Customer customer) {
        return customerService.save(customer);
    }

    /**
     * Atualiza um cliente existente com base no ID.
     */
    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @Valid @RequestBody Customer customer) {
        customer.setId(id);
        return customerService.save(customer);
    }

    /**
     * Remove um cliente pelo ID.
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        customerService.delete(id);
    }
}
