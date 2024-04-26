package com.piachimov.orderservice.utils;

import com.piachimov.orderservice.dto.OrderRequest;
import com.piachimov.orderservice.model.Order;

import java.util.UUID;
import java.util.function.Function;

public class OrderUtils {

    public static Function<OrderRequest, Order> orderRequestToOrder = orderRequest -> {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setSkuCode(orderRequest.skuCode());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        return order;
    };
}
