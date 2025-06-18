package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para operações de pedidos.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Retorna todos os pedidos.
     */
    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    /**
     * Retorna um pedido pelo ID.
     */
    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    /**
     * Cria um novo pedido.
     */
    @PostMapping
    public Order save(@Valid @RequestBody Order order) {
        return orderService.save(order);
    }

    /**
     * Atualiza um pedido existente com base no ID.
     */
    @PutMapping("/{id}")
    public Order update(@PathVariable Long id, @Valid @RequestBody Order order) {
        order.setId(id);
        return orderService.save(order);
    }

    /**
     * Deleta um pedido pelo ID.
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }
}
