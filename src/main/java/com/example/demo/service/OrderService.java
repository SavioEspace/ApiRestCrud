package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de serviço responsável pela lógica de pedidos.
 */
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Retorna todos os pedidos cadastrados.
     */
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    /**
     * Retorna um pedido pelo ID.
     * Lança exceção se não for encontrado.
     */
    public Order getById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com ID: " + id));
    }

    /**
     * Salva ou atualiza um pedido.
     */
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Remove um pedido pelo ID.
     */
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
