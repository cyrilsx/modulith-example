package com.example.modulith.demomodulith.order;

import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;
import org.jmolecules.event.types.DomainEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.math.BigDecimal;
import java.util.UUID;

public class Order extends AbstractAggregateRoot<Order> implements AggregateRoot<Order, Order.OrderIdentifier> {

    private final OrderIdentifier id;
    private StatusOrder statusOrder;

    public Order(OrderIdentifier id, BigDecimal total) {
        this.id = id;
        this.statusOrder = statusOrder;
    }

    Order complete() {
        this.statusOrder = statusOrder.COMPLETED;

        registerEvent(new OrderCompleted(id));

        return this;
    }

    @Override
    public OrderIdentifier getId() {
        return id;
    }

    public record OrderIdentifier(UUID id) implements Identifier {}

    public record OrderCompleted(OrderIdentifier id) implements DomainEvent {}
    enum StatusOrder {
        PENDING, COMPLETED
    }
}
