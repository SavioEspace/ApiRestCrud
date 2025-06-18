package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de serviço responsável pela lógica de negócios relacionada ao cliente.
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retorna todos os clientes.
     */
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    /**
     * Retorna um cliente pelo ID.
     * Lança exceção se o cliente não for encontrado.
     */
    public Customer getById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID: " + id));
    }

    /**
     * Salva um novo cliente ou atualiza um existente.
     */
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Remove um cliente pelo ID.
     */
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
