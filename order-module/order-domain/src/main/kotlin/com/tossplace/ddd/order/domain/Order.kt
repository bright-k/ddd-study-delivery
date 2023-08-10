package com.tossplace.ddd.order.domain

import com.tossplace.ddd.shared.domain.AggregateRoot

class Order(
    id: Long = 0,
    orderedId: Long,
    merchantId: Long,
    address: String,
    orderItems: List<OrderLineItem>
) : AggregateRoot() {
    var id: Long = id
        private set

    var orderedId: Long = orderedId
        private set

    var merchantId: Long = merchantId
        private set

    var address: String = address
        private set

    var orderItems: List<OrderLineItem> = orderItems
        private set

    enum class OrderState {
        ORDERED,
        PAYED,
        IN_DELIVERY,
        DELIVERY_COMPLETE,
        CANCELED,
    }
}
