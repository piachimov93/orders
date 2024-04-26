package com.piachimov.orderservice.service;

import com.piachimov.orderservice.dto.OrderRequest;
import com.piachimov.orderservice.model.Order;
import com.piachimov.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.piachimov.orderservice.utils.OrderUtils.orderRequestToOrder;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {

        Order order = orderRequestToOrder.apply(orderRequest);
        orderRepository.save(order);
    }
}
